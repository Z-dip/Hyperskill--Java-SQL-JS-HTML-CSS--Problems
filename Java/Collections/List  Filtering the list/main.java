import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfEvens = new ArrayList<>();

        while (scanner.hasNext()) {
            listOfEvens.add(scanner.nextInt());
        }
        for (int i = listOfEvens.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                listOfEvens.remove(i);
            }
        }
        Collections.reverse(listOfEvens);
        for (Integer intList : listOfEvens) {
            System.out.print(intList + " ");
        }
    }
}
