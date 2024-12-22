package Exception.Ex2;

public class CompteEpargne extends CompteBancaire{
    private double tauxInteret;

    public CompteEpargne(int numeroCompte, double soldeInitial, String nomTitulaire, double tauxInteret) {
        super(numeroCompte, soldeInitial, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public void genererInterets() {
        double interets = getSolde() * tauxInteret;
        depotArgent(interets);
    }
}
