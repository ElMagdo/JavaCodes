package Task3;

import java.util.Scanner;

public class Hexadecimal {
    public static int hexvalue(char c) {
        int hv = 0;
    
        if (c >= '0' && c <= '9') hv = Integer.parseInt("" + c);
        else {
            c = Character.toUpperCase(c);

            switch(c) {
                case 'A': hv = 10;
                        break;

                case 'B': hv = 11;
                        break;

                case 'C': hv = 12;
                        break;

                case 'D': hv = 13;
                        break;

                case 'E': hv = 14;
                        break;

                case 'F': hv = 15;
                        break;

                default: hv = -1;
            }
        }

        return hv;
    }

    public static boolean isValidHex(String str) {
        boolean chk = true;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            boolean isHexLetter = (ch >= 'A' && ch <= 'F') || Character.isDigit(str.charAt(i));

            if (!isHexLetter) {
                chk = false;
                break;
            }
        }

        return chk;
    }

    public static void toDecimal(String hex) {
        int dec = 0;

        for (int i = 0; i < hex.length(); i++) {
            dec = dec*16 + hexvalue(hex.charAt(i));
        }

        System.out.println("Decimal value: " + dec);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n+++++++++++++++ WELCOME TO HEX TO DEC CONVERSION APP+++++++++++++++\n");
        System.out.print("Enter a valid hexadecimal value: ");
        String hex = in.next();
        
        if (isValidHex(hex)) toDecimal(hex);
        else System.out.println("ERROR!! Invalid hex character found...");

        in.close();
    }
}
