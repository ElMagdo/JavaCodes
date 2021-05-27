package Task1;

import java.util.Scanner;

public class Greet {
    public static void greet(String name) {
        System.out.println("Hello, " + name + ", nice to meet you!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input your name: ");
        String name = in.nextLine();
        
        in.close();
    }
}
