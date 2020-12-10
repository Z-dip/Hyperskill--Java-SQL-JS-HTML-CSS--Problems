// put your code here
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int max_minus = -999;
        int newNum = 0;
        int currentNum = 999;
        int sum = 0;
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            newNum = scanner.nextInt();
            
            if (newNum == currentNum) {
                sum = sum - 1;
            }
            
            if (newNum > max_minus) {
                max_minus = newNum;
                sum = sum + 1;
            }
        }
        System.out.println(sum);  
    }
}
