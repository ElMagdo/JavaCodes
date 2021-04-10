package JavaJavaJava.Task2;

import java.util.Scanner;

public class Cube {
    private int length;

    Cube(int l) {
        length = l;
    }

    public int surfaceArea() {
        return 6 * length * length;
    }

    public int volume() {
        return length * length * length;
    }

    public static void main(String[] args) {
        Cube c1, c2, c3;
        int l;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the cube: ");
        l = sc.nextInt();
        c1 = new Cube(l);

        System.out.println("Cube's surface area: " + c1.surfaceArea());
        System.out.println("Cube's volume: " + c1.volume());

        System.out.println("Enter the length of the cube: ");
        l = sc.nextInt();
        c2 = new Cube(l);

        System.out.println("Cube's surface area: " + c2.surfaceArea());
        System.out.println("Cube's volume: " + c2.volume());

        System.out.println("Enter the length of the cube: ");
        l = sc.nextInt();
        c3 = new Cube(l);

        System.out.println("Cube's surface area: " + c3.surfaceArea());
        System.out.println("Cube's volume: " + c3.volume());

        sc.close();
    }
}
