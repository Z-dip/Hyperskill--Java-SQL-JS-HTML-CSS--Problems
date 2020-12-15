import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        String move = scanner.nextLine();
        int moveInt = Integer.parseInt(move);
        if (moveInt <= 9) {

            move = "0" + move;
        }

        LocalDate localDate = LocalDate.parse(year + "-" + move + "-" + "01");
        System.out.print(localDate + " ");
        System.out.print(localDate.plusMonths(1).minusDays(1));
    }
}
