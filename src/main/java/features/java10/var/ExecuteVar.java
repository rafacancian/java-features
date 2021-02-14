package features.java10.var;

import java.util.List;

public class ExecuteVar {

    public static void execute() {

        // inferred value ArrayList<String>
        var inferenceTypeList = List.of(1, 2, "string", Boolean.TRUE, 5.5);

        // Index of Enhanced For Loop
        for (var type : inferenceTypeList) {
            System.out.print(type + " ");
        }

        System.out.println("");

        // Local variable declared in a loop
        for (var i = 0; i < inferenceTypeList.size(); i++) {
            System.out.print(inferenceTypeList.get(i) + " ");
        }

    }
}
