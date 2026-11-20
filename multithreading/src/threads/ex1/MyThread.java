package threads.ex1;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" starts");
        try {
            for (int i = 0; i < 15; i++) {
                IO.println("Procession data " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException _) {
            System.out.println("Execution Interrupted..");
        }

        System.out.println(Thread.currentThread().getName()+" exits");
    }
}
