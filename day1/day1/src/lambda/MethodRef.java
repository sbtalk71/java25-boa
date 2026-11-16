package lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodRef {
    static void main() {
        Consumer<String> printer=s-> System.out.println(s);

        Consumer<String> printer2=System.out::println;

        Consumer<String> printer3=MessagePrinter::print;

        MessagePrinter mp= new MessagePrinter();

        Consumer<String> printer4=mp::printAnother;

        Function<String, String> stringData=String::new;

    }
}

class MessagePrinter{
    public static void print(String s){
        System.out.println(s);
    }

    public  void printAnother(String s){
        System.out.println(s);
    }
}
