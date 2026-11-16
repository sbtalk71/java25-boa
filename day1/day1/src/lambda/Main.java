package lambda;

public class Main {
    static void main() {

        Greet greet=new GoodMorning();
        System.out.println(greet.getGreet());


        Greet greet2=new Greet() {
            @Override
            public String getGreet() {
                return "Good Day";
            }
        };

        System.out.println(greet2.getGreet());

       Greet greet3= ()->"Good Evening";
    }
}
