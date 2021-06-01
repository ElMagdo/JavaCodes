package Task3;

import java.util.Scanner;

public class Capitalize {
    public static void printCapitalize(String str) {
        int j = 0;

        while (!Character.isLetter(str.charAt(j))) {
            j++;
            if (str.length() == j) break;
        }

        Character.toUpperCase(str.charAt(j));
        j++;

        for (int i = j; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && str.charAt(i-1) == ' ') {
                Character.toUpperCase(str.charAt(i));
            }
            
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String txt = in.nextLine();
        
        in.close();
    }
}
