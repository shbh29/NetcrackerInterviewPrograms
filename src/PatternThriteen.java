import java.util.stream.IntStream;

public class PatternThriteen {
    public static void main(String[] args) {
        /**
         * 1  2  3  4  5  6  7
         *   2  3  4  5  6  7
         *     3  4  5  6  7
         *       4  5  6  7
         *         5  6  7
         *           6  7
         *             7
         *           6  7
         *         5  6  7
         *       4  5  6  7
         *     3  4  5  6  7
         *   2  3  4  5  6  7
         * 1  2  3  4  5  6  7
         */
        int from = 1;
        int to = 7;
        IntStream.rangeClosed(from, to)
                .forEach( i -> printPyramidPattern(i, from, to));
        IntStream.rangeClosed(from+1, to)
                .map( i -> to - i + 1)
                .forEach(i -> printPyramidPattern(i, from, to));
    }
    static void printPyramidPattern(int i, int from, int to) {
        IntStream.range(from, i)
                .forEach(j -> {
                    System.out.print(" ");
                });
        IntStream.rangeClosed(i , to)
                .peek(j -> System.out.print(" "))
                .forEach(System.out::print);
        System.out.println();
    }
}
