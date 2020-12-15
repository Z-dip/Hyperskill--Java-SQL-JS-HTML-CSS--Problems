import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfMoves = scanner.nextInt();
        LocalDateTime localDateTime2 = LocalDateTime.now().minusYears(2000);

        for (int i = 0; i < numbersOfMoves; i++) {
            String temporalDate = scanner.next();
            LocalDateTime localDateTime1 = LocalDateTime.parse(temporalDate);
            if (localDateTime1.isAfter(localDateTime2)) {
                localDateTime2 = localDateTime1;
            }
        }
        System.out.println(localDateTime2);
    }
}
