package string.methods;

import java.util.stream.Stream;

public class StringDemo {
    static void main() {
        String s1="";
        String s2="     ";
        String s3="  java   ";


        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());

        System.out.println("*-*".repeat(20));

        System.out.println(s1.isBlank());
        System.out.println(s2.isBlank());
        System.out.println(s3.isBlank());

        System.out.println(s3.strip()+" end");
        System.out.println(s3.stripLeading()+" end");
        System.out.println(s3.stripTrailing()+" end");

        String someLines= """
                this is line1
                this is line2
                this is line3
                this is line4
                this is line5
                this is line6             
                """;
        Stream<String> lines=someLines.lines();
        lines.forEach(System.out::println);
    }
}
