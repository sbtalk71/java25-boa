package threads.pc;

import java.lang.foreign.ValueLayout;

public class SharedQueue {

    private int data;
    volatile  boolean valueSet=false;

    public synchronized void put(int i){
        if(valueSet){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Put : "+i);
        this.data=i;
        this.valueSet=true;
        notifyAll();
    }

    public  synchronized void get(){
        if(!valueSet){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Got : "+data);
        this.valueSet=false;
        notifyAll();
    }
}
