package features.java8.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ExampleDateApiLegacySupport {

    public static void execute() {

        // Date to localDate
        Instant timestamp = new Date().toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(timestamp, ZoneId.of(ZoneId.SHORT_IDS.get("BET")));
        System.out.println("Date to localDate: " + localDateTime);

        // Calendar to instant
        Instant time = Calendar.getInstance().toInstant();
        System.out.println("Calendar to instant: " + time);

        // Timezone to ZoneId
        ZoneId defaultZone = TimeZone.getDefault().toZoneId();
        System.out.println("Timezone to zoneId: " + defaultZone);

        //ZonedDateTime from specific Calendar
        ZonedDateTime gregorianCalendarDateTime = new GregorianCalendar().toZonedDateTime();
        System.out.println("Gregorian calendar: " + gregorianCalendarDateTime);

        // Date API to legacy classes
        Date date = Date.from(Instant.now());
        System.out.println("Date from instant: " + date);

        TimeZone timeZone = TimeZone.getTimeZone(defaultZone);
        System.out.println("timezone default: " + timeZone);

        GregorianCalendar gregorianCalendar = GregorianCalendar.from(gregorianCalendarDateTime);
        System.out.println("Gregorian calendar from gregorianCalendarDateTime: " + gregorianCalendar);


    }
}
