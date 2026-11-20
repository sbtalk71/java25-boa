package threads.ex2;

public class Main {
    static void main() throws Exception{
        TablePrinter tablePrinter=new TablePrinter();

        Thread t1=new Thread(new TableWorker(tablePrinter,5));
        Thread t2=new Thread(new TableWorker(tablePrinter,6));
        Thread t3=new Thread(new TableWorker(tablePrinter,7));
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();


    }
}
