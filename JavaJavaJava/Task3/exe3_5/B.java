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
        C c = new C(5, 6);
        B b2 = new B(5, 6);

        System.out.println("m1() for B: " + b.m1());
    }
}
