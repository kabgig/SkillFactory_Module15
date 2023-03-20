import java.io.*;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Writer writer = new FileWriter("/Users/ansarismagilov/Desktop/FileForWriting.txt");
        BufferedReader br = new BufferedReader(new FileReader("/Users/ansarismagilov/Desktop/FileForWriting.txt"));

        //creating file with numbers
        for (int i = 1; i < 10; i++) {
            var stream = Stream.iterate(1, x -> x + 1);
            stream.limit(i).forEach(s -> {
                try {
                    writer.write(s.toString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            writer.write("\n");
        }
        writer.close();

        //reading
        ArrayDeque<String> nums = new ArrayDeque<>();
        String line = "";
        while ((line = br.readLine()) != null) {
            nums.addLast(line);
        }
        while((line = nums.pollLast()) != null){
            System.out.println(line);
        }

    }
}
