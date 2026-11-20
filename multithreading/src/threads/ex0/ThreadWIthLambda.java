package threads.ex0;

public class ThreadWIthLambda {
    static void main()  throws Exception{

        Thread t1=new Thread(()->{
            try {
                for (int i = 0; i < 5; i++) {
                    IO.println("Procession data " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException _) {
                System.out.println("Execution Interrupted..");
            }
        });



        Thread t2 = Thread.ofPlatform().start(()->{
            try {
                for (int i = 0; i < 5; i++) {
                    IO.println("Procession data " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException _) {
                System.out.println("Execution Interrupted..");
            }
        });


        Thread.Builder builder = Thread.ofPlatform().name("worker-", 0);
        builder.start(()->{IO.println("Hello");});
        t1.start();

        t1.join();


    }
}
