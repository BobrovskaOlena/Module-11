package Task1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class NumberingOfNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anton");
        names.add("Ivan");
        names.add("Olena");
        names.add("Peter");
        names.add("Oksana");
        names.add("John");
        names.add("Oleg");
        names.add("Svitlana");
        names.add("Alex");
        String result = IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
    }

