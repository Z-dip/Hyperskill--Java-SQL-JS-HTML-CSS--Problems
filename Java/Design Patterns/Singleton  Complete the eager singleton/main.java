class SimpleCounter {
    // write your code here
    private static SimpleCounter instance = new SimpleCounter();

    private SimpleCounter() {}


    public int counter;

    public static SimpleCounter getInstance() {
        return instance;
    }
}
