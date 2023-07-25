import java.util.HashSet;
import java.util.Set;

public class FindIfStringHasAllUniqueCharacters {
    public static void main(String[] args) {
        /**
         *
         // "abcdeq"
         // Write one function that returns true Or false
         // Use a set
         // add characters one by one
         // check the result of set add method
         // if true: then do nothing
         // if false: then return false from the function
         // return true at the end if string length equals set size.
         // TC: O(n)
         // SC: O(n)
         */
        String str = "abcde";
        System.out.println("Given string "+str+" has all unique characters: "+ isUnique(str));
    }

    private static boolean isUnique(String str) {
        Set<Character> checkUnique =  new HashSet();
        for(int i = 0; i < str.length(); i++) {
            if(!checkUnique.add(str.charAt(i))) {
                return false;
            }
        }
        return (checkUnique.size() == str.length());
    }
}
