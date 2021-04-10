package JavaJavaJava.Task2;

import java.util.Scanner;

public class Entry {
    private String name;
    private String address;
    private String phoneNumber;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String p) {
        phoneNumber = p;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        Entry entry = new Entry();
        String n, a, p;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        n = sc.next();
        entry.setName(n);

        System.out.println("Enter address: ");
        a = sc.next();
        entry.setAddress(a);

        System.out.println("Enter phone number: ");
        p = sc.next();
        entry.setPhoneNumber(p);
    }
}
