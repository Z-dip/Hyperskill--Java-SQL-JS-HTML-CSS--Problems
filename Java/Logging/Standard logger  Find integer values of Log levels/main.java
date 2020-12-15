import java.util.Scanner;
import java.util.logging.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String logers = new String();
        int totalLogValue = 0;
        String[] stringArr = new String[logers.length()];
        logers = scanner.nextLine().toUpperCase();
        stringArr = logers.split(" ");
        
        for (String string : stringArr) {
            totalLogValue += Level.parse(string).intValue();
        }
        System.out.println(totalLogValue);
    }
}
