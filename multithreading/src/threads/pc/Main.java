package threads.pc;

public class Main {
    static void main() throws Exception {

        SharedQueue queue= new SharedQueue();

        Thread t1= new Thread(new Consumer(queue));
        Thread t2= new Thread(new Producer(queue));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
