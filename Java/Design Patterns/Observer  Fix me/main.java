import java.util.*;

interface Observable {
    // write your code here ...
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver(String game);
}

/**
 * Observable
 */

/**
 * Concrete Observable
 */
class RockstarGames implements Observable {

    private ArrayList<Observer> observers = new ArrayList<>();

    public String releaseGame;

    /**
     * write your code here ...
     */

    public void release(String game) {
        this.releaseGame = game;
        notifyObserver(game);
        /** write your code here ... */
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String game) {
        for (Observer observer : observers) {
            observer.update();
            observer.buyGame(game);


        }

    }
}

/**
 * Observer
 */
interface Observer {
    void update();

    void buyGame(String game);
    // write your code here ...

}

/**
 * Concrete Observer
 */
class Gamer implements Observer {

    private String name;
    private String reaction;
    /**
     * write your code here ...
     */

    private Set<String> games = new HashSet<>();

    public Gamer(String name, String reaction, Observable observable/** */) {
        this.reaction = reaction;
        /** write your code here ... */
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Inform message to : " + this.name);
        System.out.print(this.name + " says: ");
    }

    /**
     * write your code here ...
     */

    public void buyGame(String game) {
        games.add(game);
        System.out.println(reaction);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

/**
 * Main Class
 */

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        String game = null;

        /** write your code here ... */
        RockstarGames rockstarGames = new RockstarGames();

        Gamer garry = new Gamer("Garry Rose", "I want to pre-order", rockstarGames);
        Gamer peter = new Gamer("Peter Johnston", "Pinch me...", rockstarGames);
        Gamer helen = new Gamer("Helen Jack", "Jesus, it's new game from Rockstar!", rockstarGames);

        /** write your code here ... */
        rockstarGames.addObserver(garry);
        rockstarGames.addObserver(peter);
        rockstarGames.addObserver(helen);

        game = scanner.nextLine();
        System.out.println("It's happened! RockstarGames releases new game - " + game + "!");

        /** write your code here ... */
        rockstarGames.release(game);

        scanner.close();
    }
}
