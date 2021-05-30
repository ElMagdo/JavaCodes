package Task2;

public class SnakeEyes {
    public static void playSnakeEyes() {
        int d1 = (int)(Math.random()*6) + 1;
        int d2 = (int)(Math.random()*6) + 1;
        int i = 0;

        while (d1 != 1 || d2 != 1) {
            i++;
            d1 = (int)(Math.random()*6) + 1;
            d2 = (int)(Math.random()*6) + 1;
        }

        System.out.println("It took " + i + " throws to get Snake Eyes");
    }

    public static void main(String[] args) {
        playSnakeEyes();
    }
}
