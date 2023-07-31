import java.util.Arrays;
import java.util.*;
import static java.util.stream.Collectors.groupingBy;

class groupingByAnagram {
    public static void main(String[] args) {
        String[] arr = new String[]{"eat","tea","tan","ate","nat","bat"};
        /**
         Input: strs = ["eat","tea","tan","ate","nat","bat"]
         Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
         Group by:
         create a function
         */

        Map<String, List<String>> map = Arrays.stream(arr).collect(groupingBy(groupingByAnagram::anagram));
        System.out.println(map.values());
    }

    public static String anagram(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}