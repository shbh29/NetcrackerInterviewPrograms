import java.util.stream.IntStream;

public class PatternSeven {
    public static void main(String[] args) {
        /**
         * 7
         * 7 6
         * 7 6 5
         * 7 6 5 4
         * 7 6 5 4 3
         * 7 6 5 4 3 2
         * 7 6 5 4 3 2 1
         */
        int num = 7;
        IntStream.rangeClosed(1, num)
                .forEach(i -> {
                    int from = num - i + 1;
                    int to = num;
                    IntStream.rangeClosed(from, to)
                            .map(j -> to - j + from)
                            .forEach(System.out::print);
                    System.out.println();
                });
    }
}
