import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * Returns the largest absolute value in the array of numbers.
     *
     * @param numbers the input array of String integer numbers
     * @return the maximum integer absolute value in the array
     */
    public static int maxAbsValue(String[] numbers) {
        // write your code here
        List<String> listOfNumbers = new ArrayList<>(Arrays.asList(numbers));

        return listOfNumbers.stream()
                .mapToInt(Integer::parseInt)
                .map(Math::abs)
                .max().getAsInt();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(maxAbsValue(scanner.nextLine().split("\\s+")));
    }
}
