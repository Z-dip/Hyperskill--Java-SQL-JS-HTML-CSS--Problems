import java.util.*;   
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int counter = 0;
        String[][] array = new String[size][size];
       
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                counter = counter + 1;
                
                if (counter == size + 1) {
                    System.out.print("\n");
                    counter = 1;
                }
                array[i][j] = ". ";
                
                if (i == j) {
                    array[i][j] = "* ";
                } else if (i == size - j - 1) {
                    array[i][j] = "* ";
                } else if (i == size / 2) {
                    array[i][j] = "* ";
                } else if (j == size / 2) {
                    array[i][j] = "* ";
                }
                System.out.print(array[i][j]);    
            }
        } 
    }
}
