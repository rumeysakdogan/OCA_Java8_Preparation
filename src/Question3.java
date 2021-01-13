import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question3 {

    public static void main(String[] args) {

        //Q: What is the result?

        String date = LocalDate.parse("2014-05-04")
                                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);

        // UnsupportedTemporalTypeException will be thrown at runtime
        // due to Unsupported field: HourOfDay
    }
}
