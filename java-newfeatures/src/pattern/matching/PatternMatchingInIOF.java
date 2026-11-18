package pattern.matching;

public class PatternMatchingInIOF {
    static void main() {
        Object o="Hello";

        //traditional approach ;no Pattern matching
        if(o instanceof String){
            String s2=(String)o;
            System.out.println(s2);
        }

        //with pattern matching
        if(o instanceof String s){
            System.out.println(s);
        }
    }
}
