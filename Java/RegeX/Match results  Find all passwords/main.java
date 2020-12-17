import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = 0;
        String strings;
        Pattern pattern = Pattern.compile( "((?<=password:?)\\s*\\w+)", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            strings = matcher.group().trim();
            System.out.println(strings);
            count = count + 1;
        }
        if (count == 0) {
            System.out.println("No passwords found.");
        }

        // write your code here
    }
}
