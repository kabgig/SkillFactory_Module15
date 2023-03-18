import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        guesser(4).ifPresent(System.out::println);
    }

    public static Optional<String> guesser(int guess) {
        Random random = new Random();
        int rand;

        if (guess < 1 || guess > 5) throw new IllegalStateException();
        else rand = random.nextInt(5);
        System.out.println(rand);

        return (guess == rand) ?
                  Optional.of("Поздравляем! Вы угадали значение!") :
                  Optional.empty();
    }
}
