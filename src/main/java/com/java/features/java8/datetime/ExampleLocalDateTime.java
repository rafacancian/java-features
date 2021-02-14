package com.java.features.java8.datetime;

import java.time.*;

public class ExampleLocalDateTime {

    public static void execute() {

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current date: " + today);
        // Current date: 2021-02-14T11:53:14.223079900

        LocalDateTime today2 = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        System.out.println("Current date 2: " + today2);
        // Current date 2: 2021-02-14T00:00

        LocalDateTime todaySaoPaulo = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Current date in Sao paulo: " + todaySaoPaulo);
        // Current date in Sao paulo: 2021-02-14T08:53:14.228079300

        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
        System.out.println("365th day from base date: " + dateFromBase);
        // Current date in Sao paulo: 2021-02-14T08:53:14.228079300


    }
}
