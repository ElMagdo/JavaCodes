package JavaJavaJava.Task3;

import java.util.Scanner;

public class Permutation3 {
    public void permute(String a, String b, String c) {
        System.out.println(a + b + c);
        System.out.println(a + c + b);
        System.out.println(b + a + c);
        System.out.println(b + c + a);
        System.out.println(c + a + b);
        System.out.println(c + b + a);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Permutation3 p = new Permutation3();

        String a, b, c;

        System.out.println("Enter first string: ");
        a = sc.next();

        System.out.println("Enter first string: ");
        b = sc.next();

        System.out.println("Enter first string: ");
        c = sc.next();

        p.permute(a, b, c);

        sc.close();
    }
}
