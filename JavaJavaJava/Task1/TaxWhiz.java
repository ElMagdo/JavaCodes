package JavaJavaJava.Task1;

public class TaxWhiz {
    private double taxRate;

    TaxWhiz(double rate) {
        taxRate = rate;
    }

    public double calcTax(double purchase) {
        return taxRate * purchase;
    }

    public static void main(String args[]) {
        TaxWhiz tax1;
    }
}
