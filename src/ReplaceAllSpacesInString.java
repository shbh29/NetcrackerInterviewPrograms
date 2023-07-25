import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReplaceAllSpacesInString {
    /**
     * I will just use inbuild factory method replace All and print result
     */
    public static void main(String[] args) {
        String str = "ah what are you doing buddy";
        System.out.println("Given String is below\n "+str+"\n replaced string is: "+ squeezeSpaces(str));
    }

    private static String squeezeSpaces(String str) {
        /**
         * Loop through the String, put all characters in a StringBuilder that are not spaces
         *
         */
        return str.chars()
                .mapToObj(e -> ""+(char) e)
                .filter(ch -> !" ".equals(ch))
                .collect(Collectors.joining());
    }

}
