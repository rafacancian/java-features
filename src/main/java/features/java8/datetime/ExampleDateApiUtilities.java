package features.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class ExampleDateApiUtilities {

    public static void execute() {

        LocalDate today = LocalDate.now();

        // Lead = ano bissexto
        System.out.println("Year " + today.getYear() + " is Leap Year? " + today.isLeapYear());

        // Compare two localDate for before and after
        System.out.println("Today is before 01/01/2020? " + today.isBefore(LocalDate.of(2020, 1, 1)));

        // Create localDateTime from localDate
        System.out.println("Current time: " + today.atTime(LocalTime.now()));

        //plus operations
        System.out.println("10 days after today will be " + today.plusDays(10));
        System.out.println("3 weeks after today will be " + today.plusWeeks(3));
        System.out.println("20 months after today will be " + today.plusMonths(20));

        // minus operations
        System.out.println("10 days before today will be " + today.minusDays(10));
        System.out.println("3 weeks before today will be " + today.minusWeeks(3));
        System.out.println("20 months before today will be " + today.minusMonths(20));

        // Temporal adjusters for adjusting the dates
        System.out.println("First date of this month: " + today.with(TemporalAdjusters.firstDayOfMonth()));
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last date of this year: " + lastDayOfYear);

        Period period = today.until(lastDayOfYear);
        System.out.println("Period Format: " + period);
        System.out.println("Months remaining in the year: " + period.getMonths());


    }
}
