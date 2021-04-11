package JavaJavaJava.Task3;

import java.util.Scanner;

public class CopyMonitor {
    private boolean isLow;
    private boolean hasPrinted;

    public String checkService(int tonerLevel, int pageCount) {
        isLow = tonerLevel <= 10;
        hasPrinted = pageCount >= 100000;

        if (isLow) return "Service needed";
        else if (hasPrinted) return "Service needed";
        else return "Service not needed";
    }

    public static void main(String[] args) {
        CopyMonitor monitor = new CopyMonitor();

        Scanner sc = new Scanner(System.in);

        int level, count;

        System.out.println("Enter toner level: ");
        level = sc.nextInt();

        System.out.println("Enter page count: ");
        count = sc.nextInt();

        System.out.println("The Machine's state: " + monitor.checkService(level, count));
    }
}
