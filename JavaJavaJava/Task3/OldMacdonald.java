package JavaJavaJava.Task3;

public class OldMacdonald {
    public void farm() {
        System.out.println("Old MacDonald had a farm");
    }

    public void eieio() {
        System.out.println("E I E I O");
    }

    public void hadAnX(String s) {
        System.out.println("Old MacDonald had a " + s);
    }

    public void withA(String snd) {
        System.out.println("With a " + snd + " " + snd + "here.");
        System.out.println("And a " + snd + " " + snd + "there.");
        System.out.println("Here a " + snd + ", there a " + snd + ",");
        System.out.println("Everywhere a " + snd + snd + ".");
    }

    public static void main(String[] args) {
        OldMacdonald Mac = new OldMacdonald();

        Mac.farm();;
        Mac.eieio();
        Mac.hadAnX("duck");
        Mac.eieio();
        Mac.withA("quack");
    }
}
