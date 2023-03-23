import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        var dateFormat = new SimpleDateFormat("(dd.MM.yyyy)");
        var dateFormatPrint = new SimpleDateFormat("(ddMMyy)");
        String date = dateFormat.format(instance.getTime());
        String datePrint = dateFormatPrint.format(instance.getTime());

        Path path = Paths.get("src/balance.txt");
        List<String> strings = null;
        try {
            strings = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Map<String, Integer> myMap = strings
                .stream()
                .map(s -> s.split(", "))
                .collect(Collectors.toMap(s -> s[0], s -> {
                    if (s.length < 2) return 0;
                    else return Integer.parseInt(s[1]);
                }));
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(myMap);
        int sum = 0;
        try (FileWriter fw = new FileWriter("src/balance_total_"+datePrint+".txt")) {
            for (var i : treeMap.descendingMap().entrySet()) {
                fw.write(i.getKey() + ", " + i.getValue() + "\n");
                sum += i.getValue();
            }
            fw.write("Итого: " + sum + " руб. " + date);
        } catch (IOException b) {
            throw new RuntimeException(b);
        }


    }
}
