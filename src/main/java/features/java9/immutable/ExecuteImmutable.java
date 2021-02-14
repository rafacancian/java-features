package features.java9.immutable;

import java.util.List;
import java.util.Map;

public class ExecuteImmutable {

    public static void execute() {

        List immutableList = List.of("One", "Two", "Three");
        System.out.println("Immutable list: " + immutableList);

        Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
        System.out.println("Immutable map: " + nonemptyImmutableMap);


    }
}
