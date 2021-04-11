package JavaJavaJava.Task3;

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
}
