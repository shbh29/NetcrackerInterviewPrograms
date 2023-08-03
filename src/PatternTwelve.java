import java.util.stream.IntStream;

public class PatternTwelve {
    public static void main(String[] args) {
        /**
         * 1
         * 10
         * 101
         * 1010
         * 10101
         * 101010
         * 1010101
         */
        IntStream.rangeClosed(1, 7)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .forEach(j -> System.out.print(j % 2));
                    System.out.println();
                });
    }
}
