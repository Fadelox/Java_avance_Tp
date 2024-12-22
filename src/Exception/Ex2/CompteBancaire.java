package Exception.Ex2;

public class CompteBancaire {
    private int nombreCompte;
    private double solde;
    private String nomTitulaire;


    public CompteBancaire() {
    }

    public CompteBancaire(int nombreCompte, double solde, String nomTitulaire) {
        this.nombreCompte = nombreCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public int getNombreCompte() {
        return nombreCompte;
    }

    public void setNombreCompte(int nombreCompte) {
        this.nombreCompte = nombreCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public void  depotArgent(double monatnt){
        solde+=monatnt;
    }

    public void retraitArgent(double monatnt) throws FondsInsuffisantsException{
        if(monatnt>solde){
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le retrait.");
        }
        solde-=monatnt;
    }
    public void transfererVers(CompteBancaire destinataire, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (destinataire == null) {
            throw new CompteInexistantException("Le compte destinataire n'existe pas.");
        }
        retraitArgent(montant);
        destinataire.depotArgent(montant);
    }

}
