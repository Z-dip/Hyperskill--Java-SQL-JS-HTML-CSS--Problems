import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = -Integer.SIZE / 8; 
        int newNumber;
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            newNumber = scanner.nextInt();
            
            if (newNumber > num) {
                num = newNumber;
            } else {
                System.out.println("false");
                break;
            }
            if (i + 1 == size) {
                System.out.println("true");
            }
        }  
    }   
}
