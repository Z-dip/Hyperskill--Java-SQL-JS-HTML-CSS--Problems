import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new TreeMap<>();
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        int pairs = scanner.nextInt();

        for (int i = 0; i < pairs; i++) {
            int key = scanner.nextInt();
            String value = scanner.next();

            if (key >= from && key <= to) {
                map.put(key, value);
            }
        }
        for (var inMap : map.entrySet()) {
            System.out.println(inMap.getKey() + " " + inMap.getValue());
        }
    }
}
