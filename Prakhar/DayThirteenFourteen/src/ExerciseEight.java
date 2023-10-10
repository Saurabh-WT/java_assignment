public class ExerciseEight {
    //Runnable Interface Usage:
    //Implement a program using the Runnable interface to create and start three threads concurrently. Each thread
    // should print a unique message.
    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("Thread 1");
        TestThread2 t2 = new TestThread2("Thread 2");
        TestThread2 t3 = new TestThread2("Thread 3");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.start();
        thread3.start();
        thread2.start();
    }
}

class TestThread2 implements Runnable {
    String name;
    private static final Object lock = new Object();

    TestThread2() {
    }

    TestThread2(String name) {
        this.name = name;
    }


    @Override
    public void run() {
            synchronized (lock) {
                System.out.print("I am "+name );
//                for (int i = 1; i <= 10; i++) {
//                    System.out.print(i + " ");
//                }
                System.out.println();
            }

    }
}
