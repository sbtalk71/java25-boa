package unnamed;

import java.util.List;
import java.util.function.Consumer;

public class UnnamedDemo {
    sealed interface Result permits Success, Failure{};
    record Success(String message) implements Result{};
    record Failure(String errorCode,String message) implements Result{};

    static void main() {
        Result result=new Failure("1005","Service Unavailable");

        switch (result){
            case Success(String message)-> System.out.println("Success "+message);
            case Failure(_, String message)->System.out.println("Failure "+message);
        }

        Consumer<String> messagePrinter=(_)->IO.println("Hello Unnamed");
        messagePrinter.accept("");

        List<String> names=List.of("Ankit","Shantanu","Pavan","Raghu");

        for(String _:names){
            System.out.println("Processing data");
        }

        try{
            int data=10/0;
        }catch (ArithmeticException _){
            System.out.println("Divide by Zero");
        }
    }
}
