import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var list = new ArrayList<Integer>();
        var lowestAndHighest = new ArrayList<Integer>();
        boolean found = false;

        for (String string : scanner.nextLine().split(" ")) {
            list.add(Integer.parseInt(string));
        }

        int numberWeAreLookingFor = scanner.nextInt();

        for (int i = 0; !found; i++) {
            for (int x : list) {
                if (x == numberWeAreLookingFor - i || x == numberWeAreLookingFor + i) {
                    lowestAndHighest.add(x);
                    found = true;
                }
            }
        }
        Collections.sort(lowestAndHighest);
        for (int integer : lowestAndHighest) {
            System.out.print(integer + " ");
        }
    }
}
