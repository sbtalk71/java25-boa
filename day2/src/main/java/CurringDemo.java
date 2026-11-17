import java.util.function.Function;

public class CurringDemo {
    static void main() {
        Function<Integer, Function<Integer, Function<Integer,Integer>>> curriedAdder=a->b->c->a+b+c;

        Integer result=curriedAdder.apply(10).apply(20).apply(30);
        System.out.println(result);
    }
}
