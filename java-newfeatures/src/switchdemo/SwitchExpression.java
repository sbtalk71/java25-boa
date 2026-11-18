package switchdemo;

public class SwitchExpression {
    static void main() {
        Day day= Day.WEDNESDAY;
        int numOfLetters= switch (day){
            case MONDAY,FRIDAY,SUNDAY->6;
            case THURSDAY,SATURDAY ->8;
            case WEDNESDAY ->9;
            default ->throw new IllegalArgumentException("Unexpected value "+day);
        };

        System.out.println(numOfLetters);
    }
}
