import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        /**
         * How to find duplicate elements in a given integers list in java using Stream functions?
         */
        List lst = List.of(15,20,10,25,10,25,7,8,2,15);
        Set set = new HashSet();
        lst.stream()
                .filter(e -> !set.add(e))
                .forEach(System.out::println);
    }
}
