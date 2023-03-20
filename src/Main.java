import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Writer writer = new FileWriter("/Users/ansarismagilov/Desktop/FileForWriting.txt");
        String line = "";
        Deque<String> nums = new ArrayDeque<>();

        //creating file with numbers
        for (int i = 1; i < 10; i++) {
            var stream = Stream.iterate(1, x -> x + 1);
            nums.addLast("\n");
            stream.limit(i).forEach(s -> nums.addLast(s.toString()));
        }

        //writing
        while((line = nums.pollLast()) != null){
            writer.write(line);
            System.out.print(line);
        }
        writer.close();

    }
}
