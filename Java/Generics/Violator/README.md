******THIS PROBLEM WAS DELETED ON HYPERSKILLS, SO I INCLUDE DESCRIPTION HERE******

Violator
You are asked to perform a security audit in a baking company. Their products are represented by Bakery class and its different subclasses like Cake and LemonTart. All the pastries are sold in nice boxes. Prior to being released to the customer, all boxes are checked with carefully designed NaiveQualityControl class. However, recently a number of mistakes happened and unedible things were packed in boxes and escaped the quality check.

A short look at NaiveQualityControl led you to the conclusion that it's quite easy to provide NaiveQualityControl with Box filled with Paper that will pass QC. Now your task is to demonstrate this mistake. Here's the code:

/* This class and its subclasses should pass quality check */
class Bakery {}

class Cake extends Bakery {}

/* This one should not */
class Paper {}

/* These boxes are used to pack stuff */
class Box<T> {
    void put(T item) { /* implementation omitted */ }
    T get() { /* implementation omitted */ }
}

/* This quality checker ensures that boxes for sale contain Bakery and anything else */
class NaiveQualityControl {
  
  public static boolean check(List<Box<? extends Bakery>> boxes) {
    /* Method signature guarantees that all illegal  
       calls will produce compile-time error... or not? */  
    return true;  
  }
  
}
You need to add implementation to Violator.defraud() method that will do the following:

Create List of Boxes<? extends Bakery> according to the method signature
Put Paper object in at least one Box in the list
The resulting list should pass NaiveQualityControlcheck
Do not change the method signature or code of any other classes, just add implementation to defraud method.



Memory limit: 256 MB
Time limit: 8 seconds

Caution

You may see errors in your code or execution results due to missing context. Don’t worry about it, just write the solution and press Check.
