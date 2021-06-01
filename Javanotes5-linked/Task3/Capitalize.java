package Task3;

import java.util.Scanner;

public class Capitalize {
    public static void printCapitalize(String str) {
        System.out.println();
        int j = 0;

        while (!Character.isLetter(str.charAt(j))) {
            System.out.print(str.charAt(j));
            j++;
            if (str.length() == j) break;
        }

        System.out.print(Character.toUpperCase(str.charAt(j)));
        j++;

        for (int i = j; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && str.charAt(i-1) == ' ') {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            } else System.out.print(str.charAt(i));
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String txt = in.nextLine();

        printCapitalize(txt);

        in.close();
    }
}
