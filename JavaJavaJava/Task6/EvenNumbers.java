package JavaJavaJava.Task6;

import java.util.Scanner;

public class EvenNumbers {

    public static void even(int n) {
        for (int i = 1; i <= n; i++)
            if (i%2 == 0)
                System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
    }
}
