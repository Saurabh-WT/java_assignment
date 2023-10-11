package day13_14;

public class ThreadCreation {
    public static void main(String[] args) throws InterruptedException {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.start();
        t2.start();

    }
}

class Test  extends Thread implements Runnable{
    private static final Object lock = new Object();
    public void run() {


            synchronized(lock) {
                System.out.print(Thread.currentThread().getName() + " : ");
                for (int i = 1; i <= 10; i++) {
                System.out.print( i+" ");
            }
        }
        System.out.println();
    }
}

