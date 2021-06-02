package Task3;

public class Hexadecimal {
    public static int hexvalue(char c) {
        int hv = 0;
    
        if (c >= '0' && c <= '9') hv = Integer.parseInt("" + c);
        else {
            switch(c) {
                case 'A':
                case 'a': hv = 10;

                case 'B':
                case 'b': hv = 11;

                case 'C':
                case 'c': hv = 12;

                case 'D':
                case 'd': hv = 13;

                case 'E':
                case 'e': hv = 14;

                case 'F':
                case 'f': hv = 15;

                default: hv = -1;
            }
        }

        return hv;
    }
}
