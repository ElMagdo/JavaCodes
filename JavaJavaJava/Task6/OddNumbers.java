package JavaJavaJava.Task6;

import java.util.Scanner;

public class OddNumbers {
    public static void odd(int n) {
        for (int i = 1; i <= n; i++)
            if (i%2 == 1)
                System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a positive number to display odd numbers: ");
        int N = inp.nextInt();

        inp.close();

        odd(N);
    }
}
