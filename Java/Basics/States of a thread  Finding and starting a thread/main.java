class ThreadProcessor {
    public static void findAndStartThread(Thread... threads) throws InterruptedException {
        for (int i = 0; i < threads.length; i++) {
            if (threads[i].getState() == Thread.State.NEW) {
                threads[i].start();
                threads[i].join();
            }
        }
        // implement this method
    }
}
