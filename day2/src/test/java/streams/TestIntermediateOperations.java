package streams;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class TestIntermediateOperations {
    List<Integer> numList= Arrays.asList(1,2,3,4,4,6,7,8,8,12,15,15,18,56,67,67,68,98,80);

    @Test
    void testSumOnIntegers(){
        long sum=numList.stream().filter(n->n%2==0).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }

    @Test
    void testMapOperation(){
        numList.stream().filter(n->n%2!=0).mapToInt(n->n.intValue()+10).distinct().forEach(System.out::println);
    }

    @Test
    void testSorted(){
        //numList.stream().distinct().sorted().forEach(System.out::println);
       // Comparator<Integer> comparator=(o1,o2)->o2.intValue()-o1.intValue();
       // numList.stream().distinct().sorted((o1,o2)->o2.intValue()-o1.intValue()).forEach(System.out::println);
        numList.stream().distinct().sorted((o1,o2)->o2.intValue()-o1.intValue()).forEach(System.out::println);
    }

    @Test
    void testFlatMap(){
        List<List<Integer>> listOfNums=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));
        //System.out.println(listOfNums);
        listOfNums.stream().flatMap(list->list.stream()).forEach(System.out::println);

    }

    @Test
    void testLimitAndSkip(){
        numList.stream().distinct().skip(5).limit(8).forEach(System.out::println);
    }

    @Test
    void testReduceForAddition(){
        numList.stream().filter(n->n%2==0).mapToInt(n->n.intValue()).reduce((n1,n2)->n1+n2).ifPresent(System.out::println);
    }

    @Test
    void testFindFirst(){
        numList.stream().filter(n->n%2==0).findFirst().ifPresent(System.out::println);
    }

    @Test
    void testFindLast(){
        numList.stream().filter(n->n%2==0).mapToInt(n->n.intValue()).reduce((n1,n2)->n2).ifPresent(System.out::println);
    }

    @Test
    void testFindLast2(){
        numList.stream().filter(n->n%2==0).collect(Collectors.toList()).reversed().stream().findFirst().ifPresent(System.out::println);
    }
}


