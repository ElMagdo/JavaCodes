import java.util.Scanner;

public class Skills {
    public void displayTitle() {
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*    MULTIPLICATION TESTER    *");
        System.out.println("*                             *");
        System.out.println("*******************************");
    }

    public static void playTest(int n) {
       for (int i = 1; i <= 12; i++) {
           System.out.print(n + " x " + i + " = ");
           int ans = 0;

           if (ans == n*i) {
               System.out.println("Correct answer!! Great job.");
           }

           while (ans != n*i) {
               System.out.println("Wrong answer! Try again.");
               ans = 1;
           }
       }

       System.out.println("#######--- Thank you for taking the Test. Bye!! --######");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to take test on: ");
        int n = in.nextInt();
        in.close();
    }
}
