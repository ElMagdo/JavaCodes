package JavaJavaJava.Task1;

public class Temperature {
    private double temp;

    public void setTemp(double t) {
        temp = t;
    }

    public double getTemp() {
        return temp;
    }

    public static void main(String[] args) {
        Temperature temp1 = new Temperature();

        temp1.setTemp(25.5);

        System.out.println(temp1.getTemp());
    }
}
