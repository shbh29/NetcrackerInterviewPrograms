import java.util.stream.IntStream;

public class PatternEleven {
    public static void main(String[] args) {
        /**
         * 1
         * 2 1
         * 3 2 1
         * 4 3 2 1
         * 5 4 3 2 1
         * 6 5 4 3 2 1
         * 7 6 5 4 3 2 1
         */
        int till = 7;
        IntStream.rangeClosed(1, till)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .map(j -> i - j + 1)
                            .forEach(System.out::print);
                    System.out.println();
                });
    }
}
