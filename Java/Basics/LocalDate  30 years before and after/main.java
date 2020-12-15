import java.time.LocalDate;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String daterino = scanner.nextLine();
        LocalDate past = LocalDate.parse(daterino);
        System.out.println(past.minusYears(30));
        System.out.println(past.plusYears(30));
    }
}
