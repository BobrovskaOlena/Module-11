package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortInDescendingOrder {
    public static void main(String[] args) {
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Anton");
        names2.add("Ivan");
        names2.add("Olena");
        names2.add("Peter");
        names2.add("Oksana");
        names2.add("John");
        names2.add("Oleg");
        names2.add("Svitlana");
        names2.add("Alex");
        ArrayList<String> sortedOfNames = names2
                .stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(sortedOfNames);
    }




}
