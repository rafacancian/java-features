package features.java8.referencemethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExecuteReferenceMethod {

    public static void execute() {

        List<String> list = Arrays.asList("A", "B", "C");

        System.out.print("Anonymous class: ");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String x) {
                SimplePrinter.print(x);
            }
        });
        System.out.println("");
        System.out.print("Lambda expression: ");
        list.forEach(x -> SimplePrinter.print(x));

        System.out.println("");
        System.out.print("Method reference: ");
        list.forEach(SimplePrinter::print);

    }


    static class SimplePrinter {
        public static void print(String str) {
            System.out.print(str);
        }
    }


}
