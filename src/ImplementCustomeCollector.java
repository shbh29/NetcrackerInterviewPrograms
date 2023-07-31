import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ImplementCustomeCollector {

    static class IntegerSum {
        int sum = 0;

        public void add(int value) {
            sum += value;
        }

        public static IntegerSum merge(IntegerSum my, IntegerSum other) {
            IntegerSum mySum = new IntegerSum();
            mySum.sum = my.sum + other.sum;
            return mySum;
        }

        int getSum() {
            return sum;
        }

    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int sum = list.stream()
                .collect(Collector.of(
                        IntegerSum::new, //supplier
                        IntegerSum::add, //accumulator
                        IntegerSum::merge, //combiner in parallel processing
                        IntegerSum::getSum // finisher
                ));

        System.out.println("My Sum is: "+ sum);
    }
}
