import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfMoves = scanner.nextInt();
        LocalTime localTime2 = LocalTime.parse("20:00");

        for (int i = 0; i < numbersOfMoves; i++) {
            String nameOfShop = scanner.next();
            String temporalDate = scanner.next();
            LocalTime localTime1 = LocalTime.parse(temporalDate);
            if (localTime1.isAfter(localTime2)) {
                System.out.println(nameOfShop);
            }
        }

    }
}
