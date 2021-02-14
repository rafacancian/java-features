package com.java.features.java10.newapis;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExecuteNewApis {

    public static void execute() {

        List<String> actors = new ArrayList<>();
        actors.add("Jack Nicholson");
        actors.add("Marlon Brando");

        System.out.println(actors);
        // prints [Jack Nicholson, Marlon Brando]

        // New API added - Creates an UnModifiable List from a List.
        List<String> copyOfActors = List.copyOf(actors);
        System.out.println(copyOfActors);
        // prints [Jack Nicholson, Marlon Brando]

        // copyOfActors.add("Robert De Niro");
        // Will generate an UnsupportedOperationException

        actors.add("Robert De Niro");
        System.out.println(actors);
        // prints [Jack Nicholson, Marlon Brando, Robert De Niro]
        System.out.println(copyOfActors);
        // prints [Jack Nicholson, Marlon Brando]

        String str = "";
        Optional<String> name = Optional.ofNullable(str);
        // New API added - is preferred option then get() method
        name.orElseThrow(); // same as name.get()

        // New API added - Collectors.toUnmodifiableList
        List<String> collect = actors.stream().collect(Collectors.toUnmodifiableList());
        // collect.add("Tom Hanks");
        // Will generate an UnsupportedOperationException

    }
}
