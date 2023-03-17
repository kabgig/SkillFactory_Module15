import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(2030-1900, Calendar.JULY, 25, 12, 31);
        var res = timeConverter(date);
        System.out.println(res);
    }
    public static LocalTime timeConverter(Date date){
        Instant instant = date.toInstant();
        return LocalTime.ofInstant(instant,ZoneId.of("Europe/Moscow"));


    }
}