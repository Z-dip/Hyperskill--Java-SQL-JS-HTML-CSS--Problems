import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int secs = scanner.nextInt();
        if (secs > 0) {
            System.out.println(LocalTime.ofSecondOfDay(secs));
        }
    }
}
