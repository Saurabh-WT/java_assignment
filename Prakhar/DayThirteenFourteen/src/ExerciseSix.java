public class ExerciseSix {
    //Thread Creation:
    //Write a Java program that creates two threads, each printing numbers from 1 to 10. Ensure proper
    // synchronization to avoid interleaving.
    public static void main(String[] args) {
        TestThread t1= new TestThread();
        TestThread t2= new TestThread();

        Thread thread1= new Thread(t1);
        Thread thread2= new Thread(t2);

        thread1.start();
        thread2.start();
    }
}
class TestThread implements Runnable{
    private static final Object lock = new Object();
    @Override
    public void run() {
        synchronized (lock){
            System.out.print(Thread.currentThread().getName()+": ");
            for (int i=1; i<=10;i++ ) System.out.print(i+" ");
            System.out.println();
        }

    }
}