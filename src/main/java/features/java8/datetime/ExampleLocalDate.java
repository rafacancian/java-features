package features.java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class ExampleLocalDate {

    public static void execute() {

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);
        // Current date: 2021-02-14

        LocalDate firstDay1989 = LocalDate.of(1989, Month.JANUARY, 1);
        System.out.println("Fist day of 1989: " + firstDay1989);
        // Fist day of 1989: 1989-01-01

        //Try creating date by providing invalid inputs
        //LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
        //Exception in thread "main" java.time.DateTimeException:
        //Invalid date 'February 29' as '2014' is not a leap year

        LocalDate todaySaoPaulo = LocalDate.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Current date in Sao paulo: " + todaySaoPaulo);
        // Current date in Sao paulo: 2021-02-14

        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date: " + dateFromBase);
        // 365th day from base date: 1971-01-01

        LocalDate hundredDay1989 = LocalDate.ofYearDay(1989, 100);
        System.out.println("100th day of 1989: " + hundredDay1989);
        // 100th day of 1989: 1989-04-10

    }
}
