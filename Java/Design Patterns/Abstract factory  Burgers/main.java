class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        BurgerStore mcDonalds = new McDonStore();/* write your code here */
        BurgerStore burgerKing = new BurgerKingStore();/* write your code here */

        Burger burger;

        System.out.println("-Hello, one McDonalds style cheeseburger");
        System.out.println("-Okay! Please wait for a sec, -Calling to the McDonaldsStore. -Cheeseburger");
        burger = mcDonalds.orderBurger(Burger.CHEESE);
        Thread.sleep(1500);
        System.out.println("There it is!");
        System.out.println(burger.getName() + "\n");

        System.out.println("-Hello, one BurgerKing style hamburger");
        System.out.println("-Okay! Please wait for a sec, -Calling to the BurgerKingStore. -Hamburger\"");
        burger = burgerKing.orderBurger(Burger.HAMBURGER);
        Thread.sleep(1500);
        System.out.println("There it is!");
        System.out.println(burger.getName());
    }
}

abstract class BurgerStore {

    protected abstract Burger createBurger(String type);

    Burger orderBurger(String type) {
        Burger burger = createBurger(type);
        System.out.println("--- Making a " + burger.getName() + " ----");
        burger.collect();
        burger.box();
        return burger;
    }
}

class McDonStore extends BurgerStore {
    @Override
    protected Burger createBurger(String type) {
        Burger burger = null;
        BurgerIngredientFactory ingredientFactory = new McDonIngredientFactory();/* write your code here */

        switch (type) {
            case Burger.CHEESE :
                burger = new Cheeseburger(ingredientFactory);/* write your code here */
                burger.setName("McDonalds Style Cheeseburger");
                break;
            case Burger.VEGAN :
                burger = new VeganBurger(ingredientFactory);/* write your code here */
                burger.setName("McDonalds Style VeganBurger");
                break;
            default:
                burger = new Hamburger(ingredientFactory);/* write your code here */
                burger.setName("McDonalds Style Hamburger");
                break;
        }

        if (burger !=null) {
            burger.setBox("McDonalds Box");
        }

        return burger;
    }
}

class BurgerKingStore extends BurgerStore {
    @Override
    protected Burger createBurger(String type) {
        Burger burger = null;
        BurgerIngredientFactory ingredientFactory = new BurgerKingIngredientFactory();/* write your code here */

        switch (type) {
            case Burger.CHEESE :
                burger = new Cheeseburger(ingredientFactory);/* write your code here */
                burger.setName("BurgerKing Style Cheeseburger");
                break;
            case Burger.VEGAN :
                burger = new VeganBurger(ingredientFactory);/* write your code here */
                burger.setName("BurgerKing Style VeganBurger");
                break;
            default:
                burger = new Hamburger(ingredientFactory);/* write your code here */
                burger.setName("BurgerKing Style Hamburger");
                break;
        }

        if (burger !=null) {
            burger.setBox("BurgerKing Box");
        }

        return burger;
    }
}

interface BurgerIngredientFactory {
    Bun createBun();
    Cheese createCheese();
    Cutlet createCutlet();
    Sauce createSauce();
}

class McDonIngredientFactory implements BurgerIngredientFactory {
    @Override
    public Bun createBun() {
        return new McDonBun();/* write your code here */
    }

    @Override
    public Cheese createCheese() {
        return new McDonCheese(); /* write your code here */
    }

    @Override
    public Cutlet createCutlet() {
        return new McDonCutlet();/* write your code here */
    }

    @Override
    public Sauce createSauce() {
        return new McDonSauce();/* write your code here */
    }
}

class BurgerKingIngredientFactory implements BurgerIngredientFactory {
    @Override
    public Bun createBun() {
        return new BurgerKingBun();/* write your code here */
    }

    @Override
    public Cheese createCheese() {
        return new BurgerKingCheese();/* write your code here */
    }

    @Override
    public Cutlet createCutlet() {
        return new BurgerKingCutlet();/* write your code here */
    }

    @Override
    public Sauce createSauce() {
        return new BurgerKingSauce();/* write your code here */
    }
}

abstract class Burger {
    static final String CHEESE = "cheese";
    static final String HAMBURGER = "hamburger";
    static final String VEGAN = "vegan";

    String box;
    String name;
    Bun bun;
    Cutlet cutlet;
    Sauce sauce;
    Cheese cheese;

    abstract void collect();

    void box() {
        if (box != null) {
            System.out.println("Placing in official " + box);
        } else {
            System.out.println("Placing in official BurgerStore box");
        }
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBox(String box) {
        this.box = box;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (bun != null) {
            result.append(bun);
            result.append("\n");
        }
        if (cutlet != null) {
            result.append(cutlet);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        return result.toString();
    }
}

class Cheeseburger extends Burger {
    BurgerIngredientFactory ingredientFactory;

    Cheeseburger(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void collect() {
        System.out.println("Collecting " + name);
        bun = ingredientFactory.createBun();
        cheese = ingredientFactory.createCheese();
        cutlet = ingredientFactory.createCutlet();
        sauce = ingredientFactory.createSauce();
    }
}

class Hamburger extends Burger {
    BurgerIngredientFactory ingredientFactory;

    Hamburger(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void collect() {
        System.out.println("Collecting " + name);
        bun = ingredientFactory.createBun();
        cutlet = ingredientFactory.createCutlet();
        sauce = ingredientFactory.createSauce();
    }
}

class VeganBurger extends Burger {
    BurgerIngredientFactory ingredientFactory;

    VeganBurger(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void collect() {
        System.out.println("Collecting " + name);
        bun = ingredientFactory.createBun();
        sauce = ingredientFactory.createSauce();
    }
}

interface Bun {
    String toString();
}

class McDonBun implements Bun {
    public String toString() {
        return "McDonalds Bun";
    }
}

class BurgerKingBun implements Bun {
    public String toString() {
        return "BurgerKing Bun";
    }
}

interface Cheese {
    String toString();
}

class McDonCheese implements Cheese {
    public String toString() {
        return "McDonalds Cheese";
    }
}

class BurgerKingCheese implements Cheese {
    public String toString() {
        return "BurgerKing Cheese";
    }
}

interface Cutlet {
    String toString();
}

class McDonCutlet implements Cutlet {
    public String toString() {
        return "McDonalds Cutlet";
    }
}

class BurgerKingCutlet implements Cutlet {
    public String toString() {
        return "BurgerKing Cutlet";
    }
}

interface Sauce {
    String toString();
}

class McDonSauce implements Sauce {
    public String toString() {
        return "McDonalds Sauce";
    }
}

class BurgerKingSauce implements Sauce {
    public String toString() {
        return "BurgerKing Sauce";
    }
}
