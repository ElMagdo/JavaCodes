package Task2;

public class Words {
    public static void printWords(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) System.out.print(ch);
            if (ch == '\'') System.out.print(ch);
            if (ch == ' ') System.out.println();
        }
    }
}
