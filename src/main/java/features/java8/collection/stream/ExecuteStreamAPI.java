package features.java8.collection.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExecuteStreamAPI {

    /**
     * A new java.util.stream has been added in Java 8 to perform filter/map/reduce like operations with the collection.
     * Stream API will allow sequential as well as parallel execution.
     * This is one of the best features for me because I work a lot with Collections and usually with Big Data, we need
     * to filter out them based on some conditions.
     * <p>
     * Collection interface has been extended with stream() and parallelStream() default methods to get the Stream for
     * sequential and parallel execution
     */

    public static void execute() {

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            myList.add(i);
        }

        // create stream of integer
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.forEach(System.out::print);
        System.out.println();

        // Sequential stream
        Stream<Integer> highNumbersSequential = myList.stream().filter(number -> number > 98);
        highNumbersSequential.forEach(number -> System.out.println("High Numbers Sequential:" + number));

        // Parallel stream
        Stream<Integer> highNumbersParallel = myList.parallelStream().filter(number -> number > 98);
        highNumbersParallel.forEach(number -> System.out.println("High Numbers Parallel:" + number));

        // sum stream
        int sum = myList.stream().mapToInt(n -> n).sum();
        System.out.println("Sum: " + sum);

        // Create stream with methods
        // Stream<List<String>> streamMethod = Stream.generate(ExecuteStreamAPI::createStreamMethod);
        // System.out.println(streamMethod);
        // streamMethod.forEach(System.out::println);

        // Converting Stream to Collection
        Stream<Integer> streamToCol = Stream.of(1, 2, 3, 4, 5);
        List<Integer> intList = streamToCol.collect(Collectors.toList());
        System.out.println("Convert Stream to Collection: " + intList);

        // Converting Stream to Map
        Stream<Integer> streamToMap = Stream.of(1, 2, 3, 4, 5);
        Map<Integer, Integer> intMap = streamToMap.collect(Collectors.toMap(i -> i, i -> i + 10));
        System.out.println("Convert Stream to Map: " + intMap);

        // Converting Stream to Array
        Stream<Integer> streamToArray = Stream.of(1, 2, 3, 4, 5);
        Integer[] intArray = streamToArray.toArray(Integer[]::new);
        System.out.println("Convert Stream to Array: " + Arrays.toString(intArray));

        // Stream with Map
        Stream<String> namesUppercase = Stream.of("Rafael", "cancian");
        namesUppercase = namesUppercase.map(String::toUpperCase);
        System.out.println("Stream with map: " + namesUppercase.collect(Collectors.toList()));

        // Stream with sort
        Stream<String> namesSort = Stream.of("Cancian", "Rafael", "123456");
        List<String> reverseSorted = namesSort.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Stream with reverse sort:" + reverseSorted);

        // Stream with natural sort
        Stream<String> namesSort2 = Stream.of("Cancian", "Rafael", "123456");
        List<String> naturalSorted = namesSort2.sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Stream with  natural sort:" + naturalSorted);

        // Stream with flatMap (create a stream from the stream of list)
        Stream<List<String>> namesOriginList = Stream.of(
                Collections.singletonList("Hulk"),
                Arrays.asList("Captain america", "Thor"),
                Collections.singletonList("Iron man")
        );
        Stream<String> flatStream = namesOriginList.flatMap(Collection::stream);
        flatStream.forEach(System.out::print);
        System.out.println();

        // Reduce (perform a reduction on the elements of the stream)
        Stream<Integer> numbersReduce = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> optionalReduce = numbersReduce.reduce((i, j) -> i + j);
        if (optionalReduce.isPresent())
            System.out.println("Reduce sum numbers: " + optionalReduce.get());


        // Count
        Stream<Integer> numbersCount = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Count number of elements:" + numbersCount.count());

        // ForEach
        Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5);
        System.out.println("ForEach: ");
        numbers2.forEach(i -> System.out.print(i + ","));
        System.out.println("");

        // Match
        Stream<Integer> numbersMatchAny = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Numbers match any - contains 4? : " + numbersMatchAny.anyMatch(i -> i == 4));
        Stream<Integer> numbersMatchAll = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Numbers match all - less than 10? : " + numbersMatchAll.allMatch(i -> i < 10));
        Stream<Integer> numbersMatchNone = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Numbers match none - doesn't contain 10? : " + numbersMatchNone.noneMatch(i -> i == 10));

        // First
        Stream<String> nameCountryFirst = Stream.of("Brazil", "Portugal", "Germany", "Poland");
        Optional<String> firstCountry = nameCountryFirst.filter(i -> i.startsWith("P")).findFirst();
        if (firstCountry.isPresent())
            System.out.println("Find first country with P: " + firstCountry.get());


    }

    public static List<String> createStreamMethod() {
        List<String> list = new ArrayList<>();
        list.add("stream with method 01");
        list.add("stream with method 02");
        return list;
    }
}
