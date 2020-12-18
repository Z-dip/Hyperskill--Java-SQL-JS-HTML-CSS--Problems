
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sequence = scanner.nextInt();
        Set<String> randomSet = new TreeSet<>();

        for (int i = 0; i < sequence; i++) {
            randomSet.add(scanner.next());
        }

        for (String inSet : randomSet) {
            System.out.println(inSet);
        }
    }
}
