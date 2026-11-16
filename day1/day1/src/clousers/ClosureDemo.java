package clousers;

import java.util.function.Function;

public class ClosureDemo {

    public static Function<Integer, Integer> createMultiplier(){
        int multiplier=30;
        return n->n*multiplier;
    }
    static void main() {

        Function<Integer, Integer> multiplier=createMultiplier();
        System.out.println(multiplier.apply(20));
    }
}
