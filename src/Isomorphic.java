import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Isomorphic {
    private static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Character> charMapping = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (charMapping.containsKey(c1)) {
                if (charMapping.get(c1) != c2) {
                    return false;
                }
            } else {
                charMapping.put(c1, c2);
            }
        });

        return true;
    }

    public static void main(String[] args) {
        /**
         * aab -> xxy
         * aabc -> xxya
         */
        List<String> strings1 = Arrays.asList("aab", "yywx", "aab");
        List<String> strings2 = Arrays.asList("xxy", "aabc", "mnn");

        List<Boolean> isIsomorphicList = IntStream.range(0, strings2.size())
                .mapToObj(i -> {
                    return areIsomorphic(strings1.get(i), strings2.get(i));
                })
                .collect(Collectors.toList());

        System.out.println(isIsomorphicList); // [true, true, true, false]
    }
}
