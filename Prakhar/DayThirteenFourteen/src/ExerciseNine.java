public class ExerciseNine {
    //Synchronization Challenge:
    //Create a program where multiple threads increment a shared counter. Implement synchronization to avoid data
    // corruption.
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
//        TestThread3 t1 = new TestThread3(counter);
//        TestThread3 t2 = new TestThread3(counter);
//
//        Thread thread1 = new Thread(t1);
//        Thread thread2 = new Thread(t2);
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new TestThread3(counter));
            threads[i].start();
            threads[i].join();
        }

//        // Wait for all threads to finish
//        for (int i = 0; i < 5; i++) {
//            try {
//                threads[i].join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        System.out.println("Final Counter Value: " + counter.getCount());
    }
}

class TestThread3 implements Runnable {
    private final Counter counter;
//    private static final Object lock = new Object();

    TestThread3(Counter counter) {
        this.counter = counter;
    }


    @Override
    public void run() {
        counter.increament();
        System.out.println(Thread.currentThread().getName()+" : "+ counter.getCount() );
    }
}

class Counter {
    private int count = 0;

    public synchronized void increament() {
        count++;
    }

    public int getCount() {
        return count;
    }

}