import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class CalculateAverageSalary {

    private static double calcAverageSalary(Collection<Integer> salaries) {
        // write your code here
        return 0.0;
    }

    /* Please do not modify the code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> salaries = scanner.tokens()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(calcAverageSalary(salaries));
    }
}
