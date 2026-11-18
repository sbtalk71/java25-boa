package com.demo;

import com.math.Adder;
import greeter.messages.Greeter;

public class Main {
    static void main() {
        Greeter greeter= new Greeter();
        greeter.greet();


        Adder adder= new Adder();
        System.out.println(adder.add(4,6));
    }
}
