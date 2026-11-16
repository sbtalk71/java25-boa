package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo1 {
    static void main() {

        EvenChecker ec= new EvenChecker();
        System.out.println(ec.test(22));

        Predicate<Integer> isEven=(integer)->integer.intValue()%2==0;

        System.out.println(isEven.test(22));

        Consumer<String> messagePrinter=(message)-> System.out.println(message);

        messagePrinter.accept("Hello");


        Supplier<String> greetSupplier=()->"Good Evening";


        Function<String, String> decoratedGreet=(message)->"Hello there  "+message;
    }
}

class EvenChecker implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        return integer.intValue()%2==0;
    }
}
