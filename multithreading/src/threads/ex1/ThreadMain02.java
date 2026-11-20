package threads.ex1;

public class ThreadMain02 {
    static void main()  throws Exception{

        Thread t1=new Thread(new Worker());
        Thread t2=new Thread(new Worker());

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
