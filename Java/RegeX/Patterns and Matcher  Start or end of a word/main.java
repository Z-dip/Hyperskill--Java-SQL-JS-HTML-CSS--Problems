import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile(part + "\\b", Pattern.CASE_INSENSITIVE);
        Pattern pattern1 = Pattern.compile("\\b" + part, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        Matcher matcher1 = pattern1.matcher(line);
        if (matcher.find() || matcher1.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
