package JavaJavaJava.Task6;

import java.util.Scanner;

public class DivisibleBy10 {
    public static void divisible(int n) {
        for (int i = n; i > 0; i--) {
            if (i%10 == 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int N = inp.nextInt();
    }
}