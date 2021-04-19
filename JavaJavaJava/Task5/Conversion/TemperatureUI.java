package JavaJavaJava.Task5.Conversion;

import java.util.Scanner;

public class TemperatureUI {
    public void run() {
        System.out.println("Enter");
        System.out.println("1. Convert from Celsius to Fahrenheit");
        System.out.println("2. Convert from Fahrenheit to Celsius");

        Scanner inp = new Scanner(System.in);
        int choice = inp.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celcius: ");
            double cel = inp.nextInt();
            double fah = Temperature.celToFah(cel);
            System.out.println(cel + "C = " + fah + "F");
        }
    }
}
