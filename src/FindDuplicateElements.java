import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        /**
         * How to find duplicate elements in a given integers list in java using Stream functions?
         */
        List<Integer> lst = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 2, 4));
        Set<Integer> repeatingNumbersSet = lst.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(repeatingNumbersSet);


//                .forEach(System.out::println);
    }
}
