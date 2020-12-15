import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String minutesToMove = scanner.nextLine();

        LocalDateTime localDateTime = LocalDateTime.parse(date)
                        .plusMinutes(Integer.parseInt(minutesToMove));

        System.out.print(localDateTime.getYear() + " ");
        System.out.print(localDateTime.getDayOfYear() + " ");
        System.out.println(localDateTime.toLocalTime());
    }
}
