import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int fact = 5;
        OptionalInt res = IntStream.rangeClosed(1, fact)
                .reduce((acc, e) -> acc * e);

        System.out.println(String.format("Factorial of %d is %d", fact, res.getAsInt()));
    }
}
