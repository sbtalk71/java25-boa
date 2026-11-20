package executors;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class ExecutorWithManyCallable {
    static void main() throws Exception{
        List<String> fruits= Arrays.asList("apple","mango","guava","orange","banana","pear");

      List<UppercaseConverter> converters=  fruits.stream().map(fruit->new UppercaseConverter(fruit)).toList();

        ThreadPoolExecutor ex= (ThreadPoolExecutor)Executors.newCachedThreadPool();

       List<Future<String>> resultsFuture= ex.invokeAll(converters);

       do{
           for(int i=0;i<resultsFuture.size();i++){
               System.out.println("Procession Done : "+resultsFuture.get(i).isDone());
           }
       }while(ex.getCompletedTaskCount()<resultsFuture.size());

       resultsFuture.stream().forEach(f-> {
           try {
               System.out.println(f.get());
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           } catch (ExecutionException e) {
               throw new RuntimeException(e);
           }
       });

       ex.shutdown();
    }
}
