import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.nextLine();
        String[] dnaArray = new String[dna.length()];
        int sum = 0;
        dnaArray = dna.split("");
        for (int i = 0; i < dna.length(); i++) {
            dnaArray[i] = dnaArray[i].toUpperCase();
            if (dnaArray[i].equals("C") || dnaArray[i].equals("G")) {
                sum = sum + 1;
            } 
        } 
        System.out.println((double) sum / dna.length() * 100);
    }
}
