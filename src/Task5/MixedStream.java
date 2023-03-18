package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixedStream {
    public static void main(String[] args) {
        Stream<String>first=Stream.of("Olena","Anton","Alex","Maria","Lev","Alisa");
        Stream<String> second = Stream.of("1", "2", "3", "4", "5");
        Stream<String> result = zip(first, second);
        result
                .peek(System.out::println)
                .collect(Collectors.toList());
        }
public static <T>Stream <T> zip(Stream<T> first, Stream<T> second){
    List<T> streamFirst = first.toList();
    List<T> streamSecond = second.toList();
    int minSize = Math.min(streamFirst.size(),streamSecond.size());
    List<T> resultList = new ArrayList<T>();
    for (int i = 0; i<minSize;i++){
        resultList.add(streamFirst.get(i));
        resultList.add(streamSecond.get(i));
    }
    return resultList.stream();
}
}
