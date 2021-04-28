import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, l, s;

        System.out.println("Keep entering a positive number:");
        i = in.nextInt();
        l = s = i;

        while(i > 0) {
            l = (l > i) ? l : i;
            s = (s < i) ? s : i;
            i = in.nextInt();
        }

        System.out.println("Smallest number: " + s + "\nLargest number: " + l);
        in.close();
    }
}
