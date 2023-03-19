import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Stream<Integer> stream = Stream.iterate(1, x -> x + 1);
        stream
                .limit(100)
                .skip(50)
                .filter(x -> x % 2 == 0 || x % 5 == 0)
                .reduce((x,y) -> x+y)
                .ifPresent(System.out::println);
    }
}
