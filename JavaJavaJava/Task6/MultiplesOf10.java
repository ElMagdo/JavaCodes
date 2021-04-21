package JavaJavaJava.Task6;

import java.util.Scanner;

public class MultiplesOf10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Using for loop: ");
        System.out.println("Using while loop: ");
        System.out.println("Using do-while loop: ");

        int loop = inp.nextInt();

        if (loop == 1) {
            for (int i = 0; i <= 1000; i += 10)
                System.out.println(i);
        } else if (loop == 2) {
            int i = 0;
            while (i <= 1000) {
                System.out.println(i);
                i++;
            }
        }
    }
}
