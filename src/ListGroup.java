import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListGroup {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(12);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(25);
        list.add(25);
        list.add(50);
        list.add(50);
        list.add(50);
        list.add(50);

        Map<Integer, Long> wordCount = list.stream()
                .collect(Collectors.groupingBy((e)-> e, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(wordCount);
        System.out.println(wordCount.keySet().stream().limit(5).collect(Collectors.toList()));
    }
}
