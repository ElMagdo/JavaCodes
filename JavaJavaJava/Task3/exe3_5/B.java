package JavaJavaJava.Task3.exe3_5;

public class B {
    private int m;
    private int n;

    public B(int mn, int nm) {
        m = mn;
        n = nm;
    }

    public int m1() {
        return m*n;
    }

    public static void main(String[] args) {
        B b = new B(5, 2);

        System.out.println("m1() for B: " + b.m1());
    }
}
