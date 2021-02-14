package com.java.features.java8.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExampleDateParseFormat {

    public static void execute() {

        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant timestamp = Instant.now();

        //default format
        System.out.println("Default format of LocalDate: " + date);
        System.out.println("Default format of LocalDateTime: " + dateTime);
        System.out.println("Default format of Instant: " + timestamp);

        //specific format
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        //Parse examples
        LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
                DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing: " + dt);
    }
}
