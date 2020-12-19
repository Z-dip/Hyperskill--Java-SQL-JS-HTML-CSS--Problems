class NumbersThread extends Thread {
    int from;
    int to;


    public NumbersThread(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public void run() {
        System.out.println(from);
        while (from < to) {
            System.out.println(from + 1);
            from = from + 1;
        }
    }

    // implement the constructor
}

// you should override some method here
