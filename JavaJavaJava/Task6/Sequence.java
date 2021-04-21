package JavaJavaJava.Task6;

public class Sequence {
    public static void main(String[] args) {
        System.out.print("Using for loop: ");
        for (int i = 45; i >= -45; i -= 9)
            System.out.print(i + " ");
        System.out.println();
        
        System.out.print("Using while loop: ");
        int i = 45;
        while (i >= -45) {
            System.out.print(i + " ");
            i -= 9;
        }
        System.out.println();
        
        System.out.print("Using do-while loop: ");
        i = 45;
        do {
            System.out.print(i + " ");
            i -= 9;
        } while (i >= -45);
        System.out.println();
    }
}
