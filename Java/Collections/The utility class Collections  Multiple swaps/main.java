import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> arrListOfNums;
        arrListOfNums = Arrays.asList(scanner.nextLine().split(" ").clone());
        int numOfSwaps = scanner.nextInt();

        for (int i = 0; i < numOfSwaps; i++) {
            Collections.swap(arrListOfNums, scanner.nextInt(), scanner.nextInt());
        }
        for (String swappedElements : arrListOfNums) {
            System.out.print(swappedElements + " ");
        }
    }
}
