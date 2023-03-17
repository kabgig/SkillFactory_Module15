import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        var res = timeMethod(LocalTime.of(13, 30), Duration.ofHours(3));
        System.out.println(res);
    }
    public static boolean timeMethod (LocalTime localTime, Duration dur){

        Duration duration = Duration.between((localTime.plus(dur)), LocalTime.now());
        long milliseconds = duration.toMillis();
        System.out.println(milliseconds);

        if(milliseconds > 0) return true;
        else return false;
    }
}