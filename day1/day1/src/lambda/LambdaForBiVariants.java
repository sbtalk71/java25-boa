package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class LambdaForBiVariants {
    static void main() {

        BiFunction<Integer,Integer,Integer> adder=(n1,n2)->n1+n2;

        System.out.println(adder.apply(2,3));

        BiConsumer<String, String> biConsumer=(s1,s2)-> System.out.println(s1+" "+s2);
        biConsumer.accept("Hello","There");
    }
}
