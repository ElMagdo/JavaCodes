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
        System.out.println("Using do-while loop");
    }
}
