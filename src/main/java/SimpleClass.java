import java.time.LocalDate;

public class SimpleClass {
    public static void main(String[] args){
        new SimpleClass().add(1,2);
    }

    /**
     * Adds firstNumber and secondNumber
     * @param firstNumber the first number
     * @param secondNumber the second number
     * @return the sum of firstNumber and secondNumber
     */
    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate)
    {
        LocalDate now = LocalDate.now();
        return isDateBetween(startingDate, endingDate, now);
    }

    private static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate date) {
        return date.isAfter(startingDate) && date.isBefore(endingDate);
    }


}
