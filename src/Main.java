import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        ArrayList<Integer> objects = new ArrayList<>();
        for (var i : list){
            objects.add(Integer.parseInt(i));
        }
        Iterator<Integer> iterator = objects.iterator();
        int result = 1;
        while (iterator.hasNext()){
            result *= iterator.next();
        }
        System.out.println(result);

    }
}
