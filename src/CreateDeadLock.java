public class CreateDeadLock {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Hi this is thread 1");
                try { Thread.sleep(2000); } catch (InterruptedException e) { System.exit(0);}
                synchronized (lock2) {
                    System.out.println("Some operation after acquiring lock 2 in thread 1");
                }
            }
        }).start();
        new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Hello this is thread 2");
                try { Thread.sleep(2000); } catch (InterruptedException e) { System.exit(0);}
                synchronized(lock1) {
                    System.out.println("Some Operation after acquiring lock 1 in thread 2");
                }
            }
        }).start();
    }
    // To avoid the dead lock you can change the sequence of acquiring lock in one of the thread to match with other thread.
}
