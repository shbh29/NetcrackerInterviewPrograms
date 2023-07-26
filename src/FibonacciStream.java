import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1}, arr -> new int[]{arr[1],arr[0]+arr[1]})
                .limit(15)
                .map(arr -> arr[1])
                .forEach(System.out::println);

    }
}
