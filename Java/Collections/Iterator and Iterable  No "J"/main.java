import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        // write your code here
        List<String> listOfIterators = new LinkedList<>(Arrays.asList(array));
        ListIterator<String> listIterator = listOfIterators.listIterator();
        while (listIterator.hasNext()) {
            String iteratorsList = listIterator.next();
            if (iteratorsList.contains("J")) {
                listIterator.set(iteratorsList.substring(1));
            } else {
                listIterator.remove();
            }
        }
        Collections.reverse(listOfIterators);
        for (String inIterators : listOfIterators) {
            System.out.println(inIterators);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}
