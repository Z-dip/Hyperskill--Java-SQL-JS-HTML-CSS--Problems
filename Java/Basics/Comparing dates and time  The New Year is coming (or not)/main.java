import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        String move = scanner.next();

        LocalDate localDate = LocalDate.parse(date)
                            .plusDays(Integer.parseInt(move));

        if (localDate.getDayOfYear() != 1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
