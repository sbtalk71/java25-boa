package com.demo.list.processing;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<>();

        numList.add(1);
        numList.add(3);
        numList.add(4);
        numList.add(6);
        numList.add(7);
        numList.add(11);
        numList.add(14);
        numList.add(12);
        numList.add(40);
        numList.add(89);

        List<Integer> evenList=new ArrayList();

        for(Integer n:numList){
            if(n%2==0){
                evenList.add(n);
            }
        }

        System.out.println(evenList);
 int sum=0;
        for (Integer n:evenList){
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
