class TestDrive {
    public static void main(String[] args) throws InterruptedException {
       BurgerStore store = new BurgerStore();
       Burger cb = store.orderBurger("Chinese Burger");
        Burger ab = store.orderBurger("American Burger");
        Burger rb = store.orderBurger("Russian Burger");
    }
}

abstract class BurgerFactory {

    abstract Burger createBurger(String type);

    Burger orderBurger(String type) throws InterruptedException {
        Burger burger = createBurger(type);
        if (burger == null) {
            System.out.println("Sorry, we are not able to create this kind of burger\n");
            return null;
        }
        System.out.println("Making a " + burger.getName());
        burger.putBun();
        burger.putCutlet();
        burger.putSauce();
        Thread.sleep(1500L);
        System.out.println("Done a " + burger.getName() + "\n");
        return burger;
    }
}

class BurgerStore extends BurgerFactory {
    @Override
    Burger createBurger(String type) {
        switch (type) {
            case "Chinese Burger":
                return new ChineseBurger(type);
                case "American Burger":
                return new AmericanBurger(type);/* write your code here */
            case "Russian Burger":
                return new RussianBurger(type);/* write your code here */
            default:
                return null;
        }
    }
}

abstract class Burger {
    private String name;

    Burger(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void putBun() {
        System.out.println("Putting bun");
    }

    void putCutlet() {
        System.out.println("Putting cutlet");
    }

    void putSauce() {
        System.out.println("Putting sauce");
    }

}

class ChineseBurger extends Burger {
    ChineseBurger(String name) {
        super(name);
    }
    /* write your code here */
}

class AmericanBurger extends Burger {
    AmericanBurger(String name) {
        super(name);
    }
    /* write your code here */
}

class RussianBurger extends Burger {
    RussianBurger(String name) {
        super(name);
    }
    /* write your code here */
}
