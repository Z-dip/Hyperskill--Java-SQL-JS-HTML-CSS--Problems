******SINCE PROBLEMS NOT IN HYPERSKILLS ANYMORE, I INCLUDE IT HERE******

VeganPizzaOpen on JetBrains Academy

You've decided to cook a vegan pizza and now you need to perform the following steps in the right order (like in the sample output). Correct the mistake in the program and cook your pizza!

Note: go through these classes to understand the code better.

class Base extends Thread {    
    @Override
    public void run() {
        System.out.println("cook base");
    }
}

class Tomatoes extends Thread {
    @Override
    public void run() {
        for (int i = 3; i >= 1; i--) {
            System.out.println("slice tomatoes " + i);
        }
    }
}

class Tofu extends Thread {
    @Override
    public void run() {
        System.out.println("fry tofu");
    }
}
class Bake extends Thread{
    @Override
    public void run() {
        for (int i = 4; i >= 0; i--) {
            if (i == 0) {
                System.out.println("Your pizza is ready!");
                break;
            }
            System.out.println("to bake..." + i + " min");

        }
    }
}

Sample Input:
cook Pizza
Sample Output:
cook base
slice tomatoes 3
slice tomatoes 2
slice tomatoes 1
fry tofu
to bake...4 min
to bake...3 min
to bake...2 min
to bake...1 min
Your pizza is ready!


Memory limit: 256 MB
Time limit: 8 seconds
