package JavaJavaJava.Task3;

public class TwelveDays {
    public void intro(String day) {
        System.out.println("On the " + day + " day of Christmas my true love gave to me,");
    }

    public void day1() {
        System.out.println("a patridge in a pear tree");
    }

    public void day2() {
        System.out.println("two turtle doves");
    }

    public void day3() {
        System.out.println("three french hens");
    }

    public void day4() {
        System.out.println("four collie birds");
    }

    public void day5() {
        System.out.println("five golden rings");
    }

    public void day6() {
        System.out.println("six geese a-laying");
    }

    public void day7() {
        System.out.println("seven swans a-swimming");
    }

    public void day8() {
        System.out.println("eight maids a-milking");
    }

    public void day9() {
        System.out.println("nine pipers piping");
    }

    public void day10() {
        System.out.println("ten drummers drumming");
    }

    public void day11() {
        System.out.println("eleven lords a-leaping");
    }

    public void day12() {
        System.out.println("twelve ladies dancing");
    }

    public static void main(String[] args) {
        TwelveDays sing = new TwelveDays();

        sing.intro("twelfth");
        sing.day12();
        sing.day11();
        sing.day10();
        sing.day9();
        sing.day8();
        sing.day7();
        sing.day6();
        sing.day5();
        sing.day4();
        sing.day3();
        sing.day2();
        sing.day1();
    }
}
