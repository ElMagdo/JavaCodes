package Task2;

import java.util.Scanner;

public class Words {
    public static void printWords(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) System.out.print(ch);
            if (ch == '\'') System.out.print(ch);
            if (ch == ' ') System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String str = in.nextLine();
        in.close();
    }
}
