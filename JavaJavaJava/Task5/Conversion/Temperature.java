package JavaJavaJava.Task5.Conversion;

public class Temperature {
    public Temperature() {}

    public static double celToFah(double cel) {
        return (9.0 * cel/5.0 + 32.0) ;
    }

    public static double fahToCel(double fah) {
        return (5.0 * (fah - 32.0)/9.0);
    }
}
