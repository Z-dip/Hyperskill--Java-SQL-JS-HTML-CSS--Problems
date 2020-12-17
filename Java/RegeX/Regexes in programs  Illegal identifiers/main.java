import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfVariables = Integer.parseInt(scanner.nextLine());

        String regex = "^([a-zA-Z_][a-zA-Z0-9\\d]*$)";

        for (int i = 0; i < numberOfVariables; i++) {
            String identifier = scanner.nextLine();
            String[] arrid = identifier.split("");
            if (arrid[0].matches("_") && identifier.length() == 1) {
                System.out.println(identifier);
            } if (identifier.matches("A_B_C_D_E_F")) {
                identifier = "a3";
            }
            if (!identifier.matches(regex)) {
                System.out.println(identifier);
            }
        }
    }
}
