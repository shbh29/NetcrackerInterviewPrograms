import java.util.stream.IntStream;

public class PatternSiz {
    public static void main(String[] args) {
        /**
         * 7 6 5 4 3 2 1
         * 6 5 4 3 2 1
         * 5 4 3 2 1
         * 4 3 2 1
         * 3 2 1
         * 2 1
         * 1
         */
        int num = 9;
        IntStream.rangeClosed(1, num)
                .map(i -> num - i + 1)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .map(j -> i - j + 1)
                            .forEach(System.out::print);
                    System.out.println();
                });
    }
}
