import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/numbers.txt");
        List<String> lines = Files.readAllLines(path);

        try (BufferedWriter bW = Files.newBufferedWriter(Paths.get("src/result.txt"));) {
            for (int i = lines.size() - 1; i >= 0; i--) {
                bW.write(lines.get(i));
                bW.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
