package executors;

import java.util.concurrent.Callable;

public class UppercaseConverter implements Callable<String> {

    private String input;

    public UppercaseConverter(String input) {
        this.input = input;
    }

    @Override
    public String call() throws Exception {

        System.out.println(Thread.currentThread().getName()+" processing "+input);
        Thread.sleep(3000);

        return input.toUpperCase();
    }
}
