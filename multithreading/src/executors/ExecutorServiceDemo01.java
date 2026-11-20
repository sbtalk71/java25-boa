package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ExecutorServiceDemo01 {
    static void main()  throws Exception{

        //ExecutorService es= Executors.newFixedThreadPool(4);

      //  ExecutorService es= Executors.newCachedThreadPool();
        ExecutorService es= Executors.newSingleThreadExecutor();

       /* es.submit(new Worker());
        es.submit(new Worker());
        es.submit(new Worker());
        es.submit(new Worker());
        es.submit(new Worker());
*/
        IntStream.rangeClosed(1,30).forEach(id->{
            es.submit(new Worker());
        });

        es.awaitTermination(20,TimeUnit.SECONDS);
        es.shutdown();
    }
}
