package java9.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryForCollections {
    static void main() {
        var fruitsList= new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("orange");
        fruitsList.add("mango");

        System.out.println(fruitsList);

        fruitsList.add("pear");

        List<String> fruitsList2=List.of("apple","mango","orange");

        System.out.println(fruitsList2);
        fruitsList2.add("pear");

        Set<Integer> numSet=Set.of(1,3,5,7,9);

        Map<Integer,String> namesMap=Map.of(1,"Shantanu",2,"Raju",3,"Raghav");


    }
}
