import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfNumes;
        listOfNumes = Arrays.asList(scanner.nextLine().split(" ").clone());
        List<String> listOfNumes2;
        listOfNumes2 = Arrays.asList(scanner.nextLine().split(" ").clone());

        System.out.print(Collections.indexOfSubList(listOfNumes, listOfNumes2));
        System.out.print(" ");
        System.out.print(Collections.lastIndexOfSubList(listOfNumes, listOfNumes2));

    }
}
