import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "abcd";
        Map<Character, Long> map = str.chars()
                .mapToObj(e -> (char) e)
                .collect(groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map.entrySet());

    }
}
