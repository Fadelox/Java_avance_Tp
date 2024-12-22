package Exception.Ex1;

public class Application {
    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Valeur initiale: " + entier.getVal());

            entier.setVal(3);
            System.out.println("Valeur modifiée: " + entier.getVal());

            entier.decrementer();
            System.out.println("Après décrémentation: " + entier.getVal());

            entier.setVal(-1);
        } catch (NombreNegatifException e) {
            System.err.println("Exception capturée: " + e.getMessage());
            System.err.println("Valeur erronée: " + e.getValeurErronee());
        }

        try {
            EntierNaturel autreEntier = new EntierNaturel(-10);
        } catch (NombreNegatifException e) {
            System.err.println("Exception capturée: " + e.getMessage());
            System.err.println("Valeur erronée: " + e.getValeurErronee());
        }
    }
}
