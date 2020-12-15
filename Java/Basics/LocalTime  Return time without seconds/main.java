import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeInput = scanner.nextLine();
        String[] arrTime = timeInput.split(":");
        LocalTime time = LocalTime.parse(timeInput);
        if (time.getSecond() != 0) {
            String ripSeconds = arrTime[2];
            time = time.minusSeconds(Integer.parseInt(ripSeconds));
        }
        System.out.println(time);
    }
}
