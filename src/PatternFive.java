import java.util.stream.IntStream;

public class PatternFive {
    public static void main(String[] args) {
        /**
         * 1 2 3 4 5 6 7
         * 1 2 3 4 5 6
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
        IntStream.rangeClosed(1, 7)
                .map(i -> 8 - i)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .forEach(System.out::print);
                    System.out.println();
                });
    }
}
