package Exception.Ex1;

public class NombreNegatifException extends Exception{

    private int valeurErronee;

    public NombreNegatifException(int valeurErronee) {
        super("Valeur négative: " + valeurErronee);
        this.valeurErronee = valeurErronee;
    }

    public int getValeurErronee() {
        return valeurErronee;
    }
}
