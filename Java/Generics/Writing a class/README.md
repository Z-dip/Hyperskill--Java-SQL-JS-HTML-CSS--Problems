******THE PROBLEMS DELETED ON HYPERSKILLS, SO I PUT INSTRUCTIONS HERE******

Writing a class
Three classes are given:

class Book {
}

class Brochure extends Book {

    private String name;

    Brochure(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {
        Brochure brochure = new Brochure("NewBrochure");
        Shelf<Brochure> shelf = new Shelf<>();
        shelf.setElement(brochure);
        System.out.println(shelf.getElement().getName());
    }
}
Write a generic Shelf class which will have a field, containing a type of object, and methods getElement() and setElement(). The first method has to return an object which is contained in Shelf (which is assigned to the field), the second one is to assign a passed object to the field. The class Shelf must accept only different types of books (subtypes of Book class)!



Memory limit: 256 MB
Time limit: 8 seconds

Caution

You may see errors in your code or execution results due to missing context. Don’t worry about it, just write the solution and press Check.
