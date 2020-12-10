import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] array = new String[(word.length()) * 2];
        array = word.split("");
        
        for (int i = 0; i < word.length(); i++) {
            System.out.print(array[i]);
            System.out.print(array[i]);
        }
    }
}
