package Task4;
import java.util.stream.Stream;
public class MyGenerator {

            public static void main(String[] args) {
            long a = 25214903917L;
            long c = 11L;
            long m = (long) Math.pow(2, 48);

            Stream<Long> randomStream = myGenerate(0L, a, c, m);
            randomStream
                    .limit(25)
                    .forEach(System.out::println);
        }

    public static Stream<Long> myGenerate(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
    }
