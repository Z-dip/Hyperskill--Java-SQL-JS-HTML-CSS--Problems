import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String[] array = new String[word.length()];
        array = word.split("");
        int num = 0;
        int c = 0;
        
        for (int i = 0; i < word.length(); i++) {
            int ascii = word.charAt(i);
            
            if (ascii  == num + 1) {
                 c = c + 1;
            }
            num = ascii;
        }
       
        if (word.length() == c + 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
