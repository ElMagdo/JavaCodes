package JavaJavaJava.Task3;

public class Donor {
    private String name;
    private String rating;

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
    }
}