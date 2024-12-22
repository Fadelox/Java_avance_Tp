package Exception.Ex2;

public class CompteCourant extends CompteBancaire{
    private double decouvertAutorise;

    public CompteCourant(int numeroCompte,  double soldeInitial,String nomTitulaire, double decouvertAutorise) {
        super(numeroCompte,soldeInitial, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retraitArgent(double montant) throws FondsInsuffisantsException {
        if (getSolde() - montant < -decouvertAutorise) {
            throw new FondsInsuffisantsException("Fonds insuffisants, découvert autorisé dépassé.");
        }
        super.depotArgent(-montant);
    }
}
