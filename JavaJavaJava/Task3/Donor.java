package JavaJavaJava.Task3;

import java.util.Scanner;

public class Donor {
    private String name;
    private String rating;

    public Donor() {}

    public Donor(String n, String r) {
        name = n;
        rating = r;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setRating(String r) {
        rating = r;
    }

    public String getRating() {
        return rating;
    }

    public static void main(String[] args) {
        Donor d1 = new Donor("Daniel", "high");
        Donor d2 = new Donor();

        Scanner sc = new Scanner(System.in);

        String n, r;

        System.out.println("Donor's name: " + d1.getName());
        System.out.println("Donor's rating: " + d1.getRating());

        System.out.println("Enter donor's name: ");
        n = sc.next();
        d2.setName(n);

        System.out.println("Enter donor's rating: ");
        r = sc.next();
        d2.setRating(r);

        System.out.println("New donor's name: " + d2.getName());
        System.out.println("New donor's rating: " + d2.getRating());

        sc.close();
    }
}
