import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 372;
        System.out.println("Given number "+num+" is armstrong number: "+ isArmstringNumber(num));
    }
    private static boolean isArmstringNumber(int num) {
        boolean isArmstrongNumber = false;
        /**
         * iterate over the number by dividing the number by 10, 100, 1000. So for this I will declare a method that returns next multiplier. I will need to store a member variable and will need
         * a class for same. JS provides closure for this functionality, which is much easier.
         * --
         * get a number after dividing the number by first number of stream.
         *
         */
        int pow = String.valueOf(num).length();
        int val = IntStream.iterate(num, i -> i / 10)
                .limit(pow)
                .map(n -> (int) Math.pow(n % 10, pow))
                .sum();

        System.out.println(val);
        return num == val;
    }

}
