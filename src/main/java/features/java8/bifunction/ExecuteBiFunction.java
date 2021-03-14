package features.java8.bifunction;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ExecuteBiFunction {

    public static void execute() {

        Integer resultInteger;
        Double resultDouble;
        String resultString;
        List<Integer> resultList;

        // takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> func = Integer::sum;
        resultInteger = func.apply(2, 3);
        System.out.println(resultInteger); // 5

        // take two Integers and return an Double
        BiFunction<Integer, Integer, Double> func2 = Math::pow;
        resultDouble = func2.apply(2, 4);
        System.out.println(resultDouble);    // 16.0

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Collections.singletonList(x1 + x2);
        resultList = func3.apply(2, 3);
        System.out.println(resultList);

        // Math.pow(a1, a2) returns Double
        Function<Double, String> funcWithPrint = (input) -> "Result : " + input;
        resultString = func2.andThen(funcWithPrint).apply(2, 4);
        System.out.println(resultString);

    }


}
