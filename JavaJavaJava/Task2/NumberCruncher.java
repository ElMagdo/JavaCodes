package JavaJavaJava.Task2;

public class NumberCruncher {
    private int num;

    NumberCruncher(int n) {
        num = n;
    }

    public int getNum() {
        return num;
    }

    public int doubleNum() {
        return 2*num;
    }

    public int tripleNum() {
        return 3*num;
    }

    public int squareNum() {
        return num*num;
    }

    public int cubeNum() {
        return num*num*num;
    }

    public static void main(String args[]) {
        NumberCruncher val;
        val = new NumberCruncher(5);

        System.out.println("The number is: " + val.getNum());
        System.out.println("Double of the number: " + val.doubleNum());
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
