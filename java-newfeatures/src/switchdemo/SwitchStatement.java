package switchdemo;

public class SwitchStatement {
    static void main() {
        Day day= Day.TUESDAY;
        int numOfLetters=0;

        switch (day){
            case MONDAY,FRIDAY,SUNDAY:
                numOfLetters=6;
                break;
            case THURSDAY,SATURDAY:
                numOfLetters=8;
                break;
            case WEDNESDAY:
                numOfLetters=9;
                break;
            default: throw new IllegalArgumentException("Unexpected value "+day);
        }

        System.out.println(numOfLetters);
    }
}
