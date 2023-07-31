import java.util.Comparator;
import java.util.stream.IntStream;

public class PatternTwo {
    public static void main(String[] args) {
        /**
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 123456
         * 1234567
         * 123456
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */
        int lastNum = 7;
        IntStream.rangeClosed(1, lastNum)
                .forEach(i -> {
                    IntStream.rangeClosed(1,i)
                            .forEach(System.out::print);
                    System.out.println();
                });
        IntStream.range(1, lastNum)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .forEach(System.out::print);
                    System.out.println();
                });
    }
}
