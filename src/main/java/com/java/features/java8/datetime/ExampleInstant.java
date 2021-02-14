package com.java.features.java8.datetime;

import java.time.Duration;
import java.time.Instant;

public class ExampleInstant {

    public static void execute() {

        Instant timestamp = Instant.now();
        System.out.println("Current Timestamp = " + timestamp);
        // Current Timestamp = 2021-02-14T11:57:54.479623900Z

        Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println("Specific Time = " + specificTime);
        // Specific Time = 2021-02-14T11:57:54.479Z

        Duration thirtyDay = Duration.ofDays(30);
        System.out.println(thirtyDay);
        // PT720H
    }
}
