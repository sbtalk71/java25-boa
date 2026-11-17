package com.demo.list.processing;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(1,2,3,4,6,7,8,12,15,18,56,67,68,98,80);

        Predicate<Integer> isEven= n->n%2==0;
        System.out.println(numList.stream().filter(n->n%2==0).peek(System.out::println).count());

        numList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));

         long sum=numList.stream().filter(n->n%2==0).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }
}
