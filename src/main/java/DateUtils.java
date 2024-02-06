import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate now = LocalDate.now();
        return isDateBetween(startingDate, endingDate, now);
    }

    static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate date) {
        return date.isAfter(startingDate) && date.isBefore(endingDate);
    }
}