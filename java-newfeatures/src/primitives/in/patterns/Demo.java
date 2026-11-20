package primitives.in.patterns;

public class Demo {
    static void main() {
        Object data=2.0;

        if(data instanceof Integer i){
            System.out.println("Integer "+i);
        }

        int number=200;

        String result=switch (number){
            case 0->"its Zero";
            case 20->"its 20";
            case int x when x>20->"its more than 20";
            default -> "Number not valid";

        };

        System.out.println(result);

    }
}
