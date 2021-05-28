package Task1;

public class RollingDice {
    public static void roll() {
        int d = (int)(Math.random() * 6) + 1, sum = 0;
        System.out.println("First die comes up " + d);
        sum += d;
        d = (int)(Math.random() * 6) + 1;
        System.out.println("Second die comes up " + d);
        sum += d;
        System.out.println("Your total roll is " + sum);
    }

    public static void main(String[] args) {
        System.out.println("+++++WELCOME++++++");
        roll();
    }
}
