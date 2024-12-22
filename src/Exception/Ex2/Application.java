package Exception.Ex2;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        try {
            // Ajouter des comptes
            CompteBancaire compte1 = new CompteCourant(123,  1000,"Alice", 500);
            CompteBancaire compte2 = new CompteEpargne(456,  2000,"Bob", 0.03);
            comptes.add(compte1);
            comptes.add(compte2);

            // Effectuer des opérations
            compte1.depotArgent(200);
            System.out.println("Solde de " + compte1.getNomTitulaire() + ": " + compte1.getSolde());

            compte2.retraitArgent(500);
            System.out.println("Solde de " + compte2.getNomTitulaire() + ": " + compte2.getSolde());

            compte1.transfererVers(compte2, 300);
            System.out.println("Solde de " + compte1.getNomTitulaire() + ": " + compte1.getSolde());
            System.out.println("Solde de " + compte2.getNomTitulaire() + ": " + compte2.getSolde());

            ((CompteEpargne) compte2).genererInterets();
            System.out.println("Solde de " + compte2.getNomTitulaire() + " après intérêts: " + compte2.getSolde());

            // Supprimer un compte
            comptes.remove(compte1);
            System.out.println("Compte supprimé: " + compte1.getNombreCompte());
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.err.println("Erreur: " + e.getMessage());
        }
    }
}
