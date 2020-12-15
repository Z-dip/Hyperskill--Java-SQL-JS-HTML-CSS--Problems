import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time1 = scanner.nextLine();
        String time2 = scanner.nextLine();

        LocalTime time11 = LocalTime.parse(time1);
        LocalTime time22 = LocalTime.parse(time2);

        if (time11.isBefore(time22)) {
            System.out.println(time22.toSecondOfDay() - time11.toSecondOfDay());
        } else {
            System.out.println(time11.toSecondOfDay() - time22.toSecondOfDay());
        }
    }
}
