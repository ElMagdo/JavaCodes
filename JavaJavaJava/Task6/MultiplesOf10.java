package JavaJavaJava.Task6;

import java.util.Scanner;

public class MultiplesOf10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter\n1. To print using for loop: ");
        System.out.println("2. To print using while loop: ");
        System.out.println("3. To print using do-while loop: ");

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
        } else if (loop == 3) {
            int i = 0;
            do {
                System.out.println(i);
                i++;
            } while(i <= 1000);
        } else {
            System.out.println("You entered a wrong choice!!");
        }
    }
}
