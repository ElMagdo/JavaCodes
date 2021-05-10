import java.util.Scanner;

public class Skills {
    public static void displayTitle() {
        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
        System.out.println("+                             +");
        System.out.println("*    MULTIPLICATION TESTER    *");
        System.out.println("+                             +");
        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*\n\n\n");
    }

    public static void playTest() {
        displayTitle();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to take test on: ");
        int n = in.nextInt();

       for (int i = 1; i <= 12; i++) {
           System.out.print(n + " x " + i + " = ");
           int ans = in.nextInt();

           if (ans == n*i) {
               System.out.println("Correct answer!! Great job.\n\n");
           }

           while (ans != n*i) {
               System.out.println("Wrong answer! Try again.\n");
               System.out.print(n + " x " + i + " = ");
               ans = in.nextInt();

               if (ans == n*i) {
                   System.out.println("Correct answer!! Great job.\n\n");
               }
           }
       }
       in.close();

       System.out.println("#######--- Thank you for taking the Test. Bye!! --######");
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //in.close();

        playTest();
    }
}
