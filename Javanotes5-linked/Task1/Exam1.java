package Task1;

import java.util.Scanner;

public class Exam1 {
    public static double getAverage(int m1, int m2, int m3) {
        return (m1 + m2 + m3) / 3.0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter first term average: ");
        int m1 = in.nextInt();

        System.out.print("Enter second term average: ");
        int m2 = in.nextInt();

        System.out.print("Enter third term average: ");
        int m3 = in.nextInt();

        System.out.println("Student's name: " + name);
        System.out.println("Annual average: " + getAverage(m1, m2, m3));

        in.close();
    }
}
