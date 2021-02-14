package features.java8.collection.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

    /**
     * Java 8 has introduced forEach method in java.lang.Iterable interface so that while writing code we focus on business logic only.
     * forEach method takes java.util.function.Consumer object as argument, so it helps in having our business logic at a separate
     * location that we can reuse. Let’s see forEach usage with simple example.
     */

    public static void execute() {

        // Creating sample collection
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            myList.add(i);
        }

        // Traversing using Iterator
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println("Iterator value: " + i);
        }

        //traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("ForEach anonymous class value: " + integer);
            }
        });

        //traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

        // Traversing using lambda
        myList.forEach(integer -> System.out.println("ForEach lambda value: " + integer));

        // Traversing using for
        for (Integer integer : myList) {
            System.out.println("ForEach value: " + integer);
        }


    }

}
