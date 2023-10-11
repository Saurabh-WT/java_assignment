package day13_14;
//Implement a program using the Runnable interface to create and start three threads concurrently.
// Each thread should print a unique message.
public class RunnableInterfaceUsage {
    public static void main(String[] args) {
        Test3 t = new Test3("This is thread 1");
        Test3 t1 = new Test3("This is thread 2");
        Test3 t2 = new Test3("This is thread 3");
        t.start();
        t1.start();
        t2.start();

    }
}
class Test3 extends Thread implements Runnable{

    String s ;
    @Override
    public void run() {
        System.out.println(" "+s);
    }
    Test3(String s){
        this.s=s;
    }
}
