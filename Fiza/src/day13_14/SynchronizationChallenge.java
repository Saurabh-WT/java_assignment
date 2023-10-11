package day13_14;
//Create a program where multiple threads increment a shared counter.
// Implement synchronization to avoid data corruption
public class SynchronizationChallenge {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(c::increment);
        Thread t2 = new Thread(c::increment);
        Thread t3 = new Thread(c::increment);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        System.out.println("Count = "+c.count);
    }
}

class Counter{
    int count;
    public void increment(){
        count++;
    }
}