import java.util.stream.IntStream;

public class PatternThree {
    public static void main(String[] args) {
        /**
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         * 6 6 6 6 6 6
         * 7 7 7 7 7 7 7
         */
        IntStream.rangeClosed(1, 7)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .forEach(j -> System.out.print(i));
                    System.out.println();
                });
    }
}
