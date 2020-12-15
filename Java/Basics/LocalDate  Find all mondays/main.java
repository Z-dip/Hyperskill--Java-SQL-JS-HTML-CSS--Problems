import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        String move = scanner.next();
        int moveInt = Integer.parseInt(move);

        if (moveInt <= 9) {
        
            move = "0" + move;
        }

        LocalDate localDate = LocalDate.parse(date + "-" + move + "-" + "01");
        LocalDate lDate = localDate;
        lDate = lDate.plusMonths(1);
        LocalDate frstDate = localDate;

        do {

            localDate.getDayOfWeek().toString();

            if (localDate.getDayOfWeek().toString().equals("MONDAY")) {
                System.out.println(frstDate);
            }
            localDate = localDate.plusDays(1);
            frstDate = frstDate.plusDays(1);

        } while (localDate.isBefore(lDate));

    }
}
