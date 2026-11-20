package executors;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceWithCallable {
    static void main()  throws Exception{
        ExecutorService es= Executors.newCachedThreadPool();

     Future<String> future= es.submit(new UppercaseConverter("education"));

        System.out.println("task submitted..");

       while(true){
           if(future.isDone()){
               System.out.println("The Converted word: "+future.get());
               break;
           }
       }


        System.out.println("task completed..");

        es.shutdown();
    }
}
