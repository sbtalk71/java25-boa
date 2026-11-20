package threads.ex0;

public class MethodsDemo {

    public static void f1(){
f2();
    }

    public static void f2(){
f3();
    }
    public static void f3(){
f4();
    }

    public static void f4(){
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    static void main() {

        f1();

    }
}
