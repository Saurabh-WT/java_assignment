package day13_14;

public class ThreadManagement {
    public static void main(String[] args) {
        Test2 t1 = new Test2();
        Test t2 = new Test();

        t2.start();
        t1.start();

    }
}

class Test2 extends Thread implements Runnable{
    private static final Object lock = new Object();

    public void run() {
        try {
            //System.out.print(Thread.currentThread().getName() + " : ");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
                Thread.sleep(200);

            }
            System.out.println();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


