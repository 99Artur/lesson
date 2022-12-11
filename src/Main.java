import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("notes.txt");
        PrintWriter writer = new PrintWriter(file);
        //Random random = new Random();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            array.add(i);
        }

        Object[] i = array.stream().filter(x -> x % 3 != 0).toArray();

        writer.println(Arrays.toString(i));

        writer.close();
    }
    // filter(i -> i % 3 != 0)

    //random.ints(0, 999).distinct().limit(1000).boxed().collect(Collectors.toList());
}
