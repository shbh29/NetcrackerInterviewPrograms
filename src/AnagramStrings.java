import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        /**
         * Two strings are anagram strings if both string have same characters in different order.
         * For e.g: "now" and "own",
         * 2. "breif" and "fiber"
         * 3. "ton" and "not"
         * WAP to check two strings are anagram or not.
         * TC: O(log(n))
         * SC: O(n)
         */
        String str1 = "ton";
        String str2 = "not";
        System.out.println(String.format("Two strings %s and %s are anagram: %b", str1, str2, isAnagram(str1, str2)));

    }

    private static boolean isAnagram(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        System.out.println(Arrays.toString(s1));
        Arrays.sort(s2);
        System.out.println(Arrays.toString(s2));
        return Arrays.equals(s1, s2);
    }
}
