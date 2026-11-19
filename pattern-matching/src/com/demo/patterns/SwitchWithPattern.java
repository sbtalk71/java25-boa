package com.demo.patterns;

public class SwitchWithPattern {
    static void main() {
        Object obj = "hello";
        String result = switch (obj) {
            case Integer r -> "It is an Integer";
            case String s -> "It is a String";
            case Double d -> "It is a double value";
            default -> throw new IllegalArgumentException("Unexpected value");
        };
        System.out.printf(" The result is %s",result);
    }
}
