public class RollingDice {
    public static void roll(int i) {
        int d1, d2;

        if (i == 1) {
            d1 = (int)(Math.random() * 6) + 1;
            System.out.println("The first die comes up " + d1);
        } else {
            d2 = (int)(Math.random() * 6) + 1;
            System.out.println("The second die comes up " + d2);
            System.out.println("Your total roll is " + d1 + d2);
        }
    }

    public static void main(String[] args) {
        System.out.println("+++++WELCOME++++++");
    }
}
