package JavaJavaJava.Task3.exe3_5;

public class C {
    private int m;
    private int n;

    public C(int mIn , int nIn) {
        m = mIn;
        n = nIn;
    }
    
    public int m1() {
        return m+n;
    }

    public static void main(String[] args) {
        C c = new C(5, 2);
    }
}