package JavaJavaJava.Task2;

public class Cube {
    private int length;

    Cube(int l) {
        length = l;
    }

    public int surfaceArea() {
        return 6 * length * length;
    }

    public int volume() {
        return length * length * length;
    }

    public static void main(String[] args) {
        Cube c1, c2, c3;
        int l;
    }
}
