import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.of(LocalDate.now(), LocalTime.now(ZoneId.of("Europe/Moscow")), ZoneId.of("Europe/Moscow")));
        ;
    }
}