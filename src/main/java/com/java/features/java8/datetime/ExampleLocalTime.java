package com.java.features.java8.datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class ExampleLocalTime {

    public static void execute() {

        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);
        // Current time: 11:36:30.076771100

        LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
        System.out.println("Specific Time of Day=" + specificTime);
        // Specific Time of Day=12:20:25.000000040

        //Try creating time by providing invalid inputs
        //LocalTime invalidTime = LocalTime.of(25,20);
        //Exception in thread "main" java.time.DateTimeException:
        //Invalid value for HourOfDay (valid values 0 - 23): 25

        LocalTime todaySaoPaulo = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Current date in Sao paulo: " + todaySaoPaulo);
        // Current date in Sao paulo: 08:39:33.574970300

        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time= " + specificSecondTime);
        // 10000th second time= 02:46:40

    }
}
