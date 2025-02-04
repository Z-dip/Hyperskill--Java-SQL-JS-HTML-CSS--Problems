import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;
import java.util.stream.*;

class CustomReducer {

    /**
     * The operator combines all values in the given range into one value
     * using combiner and initial value (seed)
     */
    public static final BiFunction<Integer, IntBinaryOperator, IntBinaryOperator> reduceIntOperator =
    (seed, f) -> (left, right) -> IntStream.rangeClosed(left, right).reduce(seed, f);

    /**
     * The operator calculates the sum in the given range (inclusively)
     */
    public static final IntBinaryOperator sumOperator =
            (left, right) -> IntStream.rangeClosed(left, right).reduce(Integer::sum).orElse(0);

    /**
     * The operator calculates the product in the given range (inclusively)
     */
    public static final IntBinaryOperator productOperator = // write your code here
            (left, right) -> IntStream.rangeClosed(left, right).reduce(1, (x, y) -> x * y);

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");

        int l = Integer.parseInt(values[0]);
        int r = Integer.parseInt(values[1]);

        int sumReducer = reduceIntOperator.apply(0, Integer::sum).applyAsInt(l, r);
        int sum = sumOperator.applyAsInt(l, r);

        int prodReducer = reduceIntOperator.apply(1, (x, y) -> x * y).applyAsInt(l, r);
        int prod = productOperator.applyAsInt(l, r);

        System.out.println(String.format("%d %d %d %d", sumReducer, sum, prodReducer, prod));
    }
}
