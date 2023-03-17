package Task1;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class NumberingOfNames {
    public static void main(String[] args) {
        String[] names = {"Olena", "Oleg", "Anton", "Svitlana", "John", "Bill", "Max", "Alex"};
        int i = 1;
        Stream<String> name = Arrays.asList(names)
                .stream()
                .map(names-> {
                    return (i+"." + names;
                })



    }
    }

