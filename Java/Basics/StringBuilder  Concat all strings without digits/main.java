import java.util.Scanner;
import java.util.stream.Stream;

class ConcateStringsProblem {

    public static String concatStringsWithoutDigits(String[] strings) {
        StringBuilder sb = new StringBuilder(String.join("",strings));
        return sb.toString().replaceAll("[0-9]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = Stream
                .of(scanner.nextLine().split("\\s+"))
                .toArray(String[]::new);

        String result = concatStringsWithoutDigits(strings);

        System.out.println(result);
    }
}
