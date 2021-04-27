package JavaJavaJava.Task6;

import java.util.Scanner;

public class DivisbleBy10 {
    public static void divisible(int n) {
        for (int i = n; i > 0; i--) {
            if (i % 10 == 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int N = in.nextInt();
    }
}
