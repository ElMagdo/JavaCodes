import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Just keep entering a smaller number");

        int i = in.nextInt();
        while(in.hasNext()) {
            int j = in.nextInt();

            if (j > i) break;
        }
        
        in.close();
    }
}
