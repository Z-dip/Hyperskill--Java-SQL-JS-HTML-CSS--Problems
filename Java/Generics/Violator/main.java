import java.util.ArrayList;
/**
 * Class to work with
 */

class Violator {

    public static List<Box<? extends Bakery>> defraud() {
        var list = new ArrayList<Box<? extends Bakery>>();
        var paperBox = new Box();
        paperBox.put(new Paper());
        list.add(list.size(), paperBox);
        return list;
    }

}
