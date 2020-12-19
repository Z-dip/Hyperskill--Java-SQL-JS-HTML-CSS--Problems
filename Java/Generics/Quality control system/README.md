******THIS PROBLEM GOT DELETED ON HYPERSKILLS, SO I INCLUDE IT HERE******

Quality control system
You are asked to create quality control system in a company that produces and packs Bakery, the snippet of main classes follows:

// These and its subclasses should pass quality check
class Bakery {}

class Cake extends Bakery {}

// And this and other stuff should not
class Paper {}

// These boxes are used to pack stuff
interface Box<T> {
    void put(T item);
    T get();
}

// Class you need to work on
class QualityControl {
  
  public static boolean check(List<Box<? extends Bakery>> boxes) {
      // Add implementation here
  }
  
}
Implement check method in a way it would:

Return true if all objects in all boxes belong to class Bakery or its subclasses or list contains no boxes
Return false otherwise, including cases when Box is empty or List contains something that is not Box at all
The method shouldn't throw any exceptions.


Sample Input:
QualityControl class

Sample Output:
Well done!



Memory limit: 256 MB
Time limit: 8 seconds

Caution

You may see errors in your code or execution results due to missing context. Don’t worry about it, just write the solution and press Check.
