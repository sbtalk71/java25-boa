package com.demo.patterns;

public class GuardedPatternInSwitch {
    static void main() {
        Object num="hello";
        String result=switch(num){
            case Integer r  when r<10-> "The number is less than 10";
            case Integer r  when r>10-> "The number is more than 10";
            case Integer r when r==10-> "The number is 10";
            default -> throw new IllegalArgumentException("not an integer");
        };

        System.out.printf("The rsult: %s",result);
    }
}
