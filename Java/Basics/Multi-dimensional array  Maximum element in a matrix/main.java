import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int maxNum = -214_748_364_8;
        int right = -1;
        int down = -1;
        int[][] array = new int[row][column];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] > maxNum) {
                    maxNum = array[i][j];
                    right = i;
                    down = j;
                }
                System.out.print(" ");
            } 
        }  
        System.out.printf("%d %d", right, down); 
    } 
}
