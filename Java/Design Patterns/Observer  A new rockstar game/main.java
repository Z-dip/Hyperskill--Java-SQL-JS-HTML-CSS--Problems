import java.util.*;

/**
 * Observable interface
 **/
interface Observable {
    // write your code here ...
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver(String game);
}

/**
 * Concrete Observable - Rockstar Games
 **/
class RockstarGames implements Observable {

    public String releaseGame;
    private ArrayList<Observer> observers = new ArrayList<>();
    // write your code here ...

    public void release(String game) {
        this.releaseGame = game;
        notifyObserver(game);
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
 * Observer interface
 **/
interface Observer {
    void update();
    void buyGame(String game);
    // write your code here ...

}

/**
 * Concrete observer - Gamer
 **/
class Gamer implements Observer {

    private String name;
    private Observable observable;
    private Set<String> games = new HashSet<>();

    public Gamer(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Notification for gamer : " + this.name);
    }
    // write your code here ...
    @Override
    public void buyGame(String game) {
        if (games.contains(game)) {
            System.out.println("What? They've already released this game ... I don't understand");
        }
        else {
            System.out.println(name + " says : \"Oh, Rockstar releases new game " + game + " !\"");
            games.add(game);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}

/**
 * Main class
 **/
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String game = null;

        RockstarGames rockstarGames = new RockstarGames();

        Gamer garry = new Gamer("Garry Rose", rockstarGames);
        Gamer peter = new Gamer("Peter Johnston", rockstarGames);
        Gamer helen = new Gamer("Helen Jack", rockstarGames);

        rockstarGames.addObserver(garry);
        rockstarGames.addObserver(peter);
        rockstarGames.addObserver(helen);

        for (int i = 0; i < 2; i++) {
            game = scanner.nextLine();
            rockstarGames.release(game);
        }

        scanner.close();
    }
}
