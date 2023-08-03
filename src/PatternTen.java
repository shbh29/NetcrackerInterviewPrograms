import java.util.stream.IntStream;

public class PatternTen {
    public static void main(String[] args) {
        /**
         * 1234567
         *   234567
         *     34567
         *       4567
         *         567
         *           67
         *             7
         *           67
         *         567
         *       4567
         *     34567
         *   234567
         * 1234567
         */
        int from = 1;
        int to = 7;
        IntStream.rangeClosed(from, to)
                .forEach(i -> printSpaceAndNumbers(i, to));
        IntStream.rangeClosed(from + 1, to) // 2, 7
                .map(i -> to - i + 1) //
                .forEach(i -> printSpaceAndNumbers(i, to));
    }
    static void printSpaceAndNumbers(int separateOn, int till) {
        //print space
        IntStream.range(1, separateOn)
                .forEach(j -> System.out.print(" "));
        // print numbers
        IntStream.rangeClosed(separateOn, till)
                .forEach(System.out::print);
        System.out.println();
    }
}
