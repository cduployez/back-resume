package fr.cduployez.backresume.utils;

import java.time.*;

public class OffsetDateTimeUtils {

    public static OffsetDateTime fromYear(int year, Clock clock) {
        LocalDate firstDayOfYear = Year.of(year).atDay(1);
        return toOffsetDateTime(firstDayOfYear, clock);
    }

    public static OffsetDateTime fromDate(int day, int month, int year, Clock clock) {
        LocalDate date = LocalDate.of(year, month, day);
        return toOffsetDateTime(date, clock);
    }

    private static OffsetDateTime toOffsetDateTime(LocalDate date, Clock clock) {
        return date.atStartOfDay().atOffset(clock.getZone().getRules().getOffset(Instant.now()));
    }
}
