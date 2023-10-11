public class ExerciseSeven {
    //Thread Management:
    //Extend the previous program to make one thread sleep for 200 milliseconds after printing each number. Observe
    // the execution order.
    public static void main(String[] args) {
        TestThread1 t1 = new TestThread1();
        TestThread t2 = new TestThread();//this is old class in ExerciseSix

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
}

class TestThread1 implements Runnable {
    private static final Object lock = new Object();

    @Override
    public void run() {
        try {
//            synchronized (lock) {
//                System.out.print(Thread.currentThread().getName() + ": ");
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + " ");
                    Thread.sleep(200);
                }
                System.out.println();
//            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}