package Task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedOfNumbers {
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};
        String number = Arrays.stream(numbers)
                .flatMap(num->Arrays.stream(num.split(",\\s*")))
                .map(String::trim)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(number);

    }
}
