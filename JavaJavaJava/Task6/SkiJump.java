package JavaJavaJava.Task6;

public class SkiJump {
    public static void main(String[] args) {
        System.out.println("Using for loop:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }

        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 7) {
            int j = 1;
            while (j <= i) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Using do-while loop");
        i = 1;
        do {
            int j = 1;
            do {
                System.out.print('*');
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 7);
    }
}
