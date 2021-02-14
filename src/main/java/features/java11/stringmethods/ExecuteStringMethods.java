package features.java11.stringmethods;

import java.util.stream.Collectors;

public class ExecuteStringMethods {

    public static void execute() {

        isBlank();
        lines();
        strip();
        repeat();

    }

    private static void repeat() {
        String str = "=".repeat(2);
        System.out.println(str); //prints ==
    }

    private static void strip() {
        System.out.println("Examples with strip");

        final String middle = " middle ";
        final String start = "Start";
        final String end = "End";

        System.out.print(start);
        System.out.print(middle.strip());
        System.out.println(end);

        System.out.print(start);
        System.out.print(middle.stripLeading());
        System.out.println(end);

        System.out.print(start);
        System.out.print(middle.stripTrailing());
        System.out.println(end);
    }

    private static void lines() {
        System.out.println("Examples with lines");

        String str = "JD\nJD\nJD";
        System.out.println("lines: " + str);
        System.out.println("lines to collect: " + str.lines().collect(Collectors.toList()));
    }

    private static void isBlank() {
        System.out.println("Examples with blank");

        System.out.println(" ".isBlank()); //true

        String s1 = "Rafael";
        System.out.println(s1.isBlank()); //false

        String s2 = "";
        System.out.println(s2.isBlank()); //true
    }
}
