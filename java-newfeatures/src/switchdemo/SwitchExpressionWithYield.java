package switchdemo;

public class SwitchExpressionWithYield {
    static void main() {
        Day day= Day.WEDNESDAY;
        int numOfLetters= switch (day){
            case MONDAY,FRIDAY,SUNDAY:
                System.out.println("No of letters is "+6);
                yield 6;
            case THURSDAY,SATURDAY:
                System.out.println("No of letters is "+8);
                yield 8;
            case WEDNESDAY:
                System.out.println("No of letters is "+9);
                yield 9;
            default: throw new IllegalArgumentException("Unexpected value "+day);
        };

        System.out.println(numOfLetters);
    }
}
