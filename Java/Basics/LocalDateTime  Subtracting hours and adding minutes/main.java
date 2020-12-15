import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        String changeHour = scanner.next();
        String changeMinute = scanner.next();
        LocalDateTime localDateTime = LocalDateTime.parse(time);
        System.out.println(localDateTime
                            .minusHours(Integer.parseInt(changeHour))
                            .plusMinutes(Integer.parseInt(changeMinute)));
    }
}
