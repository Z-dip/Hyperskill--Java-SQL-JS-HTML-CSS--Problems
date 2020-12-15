import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();

        LocalDateTime localDateTime = LocalDateTime.parse(time);
        localDateTime = localDateTime.plusHours(11);
        LocalDate localDate = LocalDate.from(localDateTime);

        System.out.println(localDate);
    }
}
