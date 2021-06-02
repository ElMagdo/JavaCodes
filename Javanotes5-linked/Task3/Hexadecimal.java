package Task3;

public class Hexadecimal {
    public static int hexvalue(char c) {
        int hv = 0;
    
        if (c >= '0' && c <= '9') hv = Integer.parseInt("" + c);
        else {
            switch(Character.toUpperCase(c)) {
                case 'A': hv = 10;

                case 'B': hv = 11;

                case 'C': hv = 12;

                case 'D': hv = 13;

                case 'E': hv = 14;

                case 'F': hv = 15;

                default: hv = -1;
            }
        }

        return hv;
    }
}
