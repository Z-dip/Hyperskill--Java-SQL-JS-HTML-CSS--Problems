import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        // implement this method
        while (currentThread().isAlive()) {
            String randStr = scanner.nextLine();
             if (!randStr.equals(randStr.toLowerCase())) {
                 System.out.println(randStr.toUpperCase());
                 break;
                
            } 
            if (randStr.equals(randStr.toUpperCase())) {
                System.out.println(randStr.toUpperCase());
                System.out.println("FINISHED");
                break;
                
            } 
             
           
        }
    }

}

// implement this method
