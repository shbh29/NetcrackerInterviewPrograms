import java.util.Arrays;

public class CountNumberOfWordsInAString {
    public static void main(String[] args) {
        /**
         * "ab bc
         * cd yo"
         */
        String para = "ab cd \nef gh\0sb";
        long count = para.chars()
                .map(e -> (char) e)
                .filter(ch -> ch == ' ' || ch == '\n' || ch == '\0')
                .count();
        System.out.println("number of words in the string is: "+ count);

    }
}
