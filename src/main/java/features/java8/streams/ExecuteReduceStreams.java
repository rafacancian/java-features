package features.java8.streams;

import java.util.Arrays;


public class ExecuteReduceStreams {


    public static void execute() {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum011 = Arrays.stream(numbers).reduce(0, (a, b) -> a + b); // 1st argument, init value = 0
        int sum012 = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println("sum : " + sum011); // 55
        System.out.println("sum : " + sum012); // 55

        int max1 = Arrays.stream(numbers).reduce(0, Integer::max);  // 10
        System.out.println("max: " + max1);

        int min1 = Arrays.stream(numbers).reduce(0, Integer::min); // 0
        System.out.println("min: " + min1);

        // Join String
        String[] strings = {"a", "b", "c", "d", "e"};

        // |a|b|c|d|e , the initial | join is not what we want
        String reduce = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
        System.out.println(reduce);

        // a|b|c|d|e, filter the initial "" empty string
        String reduce2 = Arrays.stream(strings).reduce("", (a, b) -> {
            if (!"".equals(a)) {
                return a + "|" + b;
            } else {
                return b;
            }
        });
        System.out.println(reduce2);

        // a|b|c|d|e , better uses the Java 8 String.join :)
        String join = String.join("|", strings);
        System.out.println(join);

    }


}