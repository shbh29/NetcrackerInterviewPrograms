import java.util.stream.IntStream;

public class PatternNine {
    public static void main(String[] args) {
        /**
         * 1 2 3 4 5 6 7
         * 1 2 3 4 5 6
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         * 1 2 3 4 5 6
         * 1 2 3 4 5 6 7
         */
        int from = 1;
        int no = 7;
        IntStream.rangeClosed(from, no)
                .map( i -> no - i + 1)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .forEach(System.out::print);
                    System.out.println();
                });
        IntStream.rangeClosed(from + 1, no)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .forEach(System.out::print);
                    System.out.println();
                });
    }
}
