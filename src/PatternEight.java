import java.util.stream.IntStream;

public class PatternEight {
    public static void main(String[] args) {
        /**
         * 1
         * 1 2 1
         * 1 2 3 2 1
         * 1 2 3 4 3 2 1
         * 1 2 3 4 5 4 3 2 1
         * 1 2 3 4 5 6 5 4 3 2 1
         * 1 2 3 4 5 6 7 6 5 4 3 2 1
         */
        int no = 7;
        IntStream.rangeClosed(1, no)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .forEach(System.out::print);
                    int to = i - 1;
                    IntStream.rangeClosed(1, to)
                            .map(j -> to - j + 1)
                            .forEach(System.out::print);
                    System.out.println();
                });
    }
}
