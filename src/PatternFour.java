import java.util.Comparator;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class PatternFour {
    public static void main(String[] args) {
        /**
         * 7 6 5 4 3 2 1
         * 7 6 5 4 3 2
         * 7 6 5 4 3
         * 7 6 5 4
         * 7 6 5
         * 7 6
         * 7
         */
        IntStream.rangeClosed(1, 7)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(i -> {
                    IntStream.rangeClosed(8-i, 7)
                            .boxed()
                            .sorted(Comparator.reverseOrder())
                            .forEach(out::print);
                    out.println();
                });
    }
}
