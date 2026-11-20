package threads.pc;

public class Producer implements Runnable{

    private SharedQueue sharedQueue;
    private int i=0;

    public Producer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try {
            while(true){
                sharedQueue.put(i++);
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
