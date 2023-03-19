import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        list
                .stream()
                .map(Integer::parseInt)
                .reduce((x,y) -> x*y)
                .ifPresent(System.out::println);
    }
}
