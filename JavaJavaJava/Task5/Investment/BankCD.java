package JavaJavaJava.Task5.Investment;

public class BankCD {
    private double principal;
    private double rate;
    private double years;

    public BankCD(double p, double r, double n) {
        principal = p;
        rate = r;
        years = n;
    }

    public double yearlyCD() {
            return principal * Math.pow((1 + rate * 365), 365 * years);
        }
}
