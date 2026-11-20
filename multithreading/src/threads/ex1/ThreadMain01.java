package threads.ex1;

public class ThreadMain01 {
    static void main()  throws Exception{
        System.out.println(Thread.currentThread().getName()+" starts");
        Thread.currentThread().setPriority(7);
        MyThread t1=new MyThread();
        MyThread t2= new MyThread();

        System.out.println("Thread Main"+ Thread.currentThread());

        System.out.println("T1 : "+t1);
        System.out.println("T2 : "+t2);
        System.out.println(t1.getState());

        t1.start();
        t2.start();

        System.out.println(t1.getState());

        t1.join();
        t2.join();
        System.out.println(Thread.currentThread().getName()+" exits");




    }
}
