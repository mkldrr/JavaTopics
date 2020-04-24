package switch_statements;

import java.util.Scanner;

public class SwitchStatements {
    //TODO create method it is going return weather the day is weekend or not?
    public static void main(String[] args) {
        System.out.println(isWeekend());
    }
    public static boolean isWeekend(){
       boolean isDayWeekend=true;
        Scanner input = new Scanner(System.in);
        switch (input.nextLine()) {
            case "Monday":
                isDayWeekend = false;
                break;
            case "Tuesday":
                isDayWeekend = false;
                break;
            case "Wednesday":
                isDayWeekend = false;
                break;
            case "Thursday":
                isDayWeekend = false;
                break;
            case "Friday":
                isDayWeekend = false;
                break;
            case "Saturday":
                isDayWeekend = true;
                break;
            case "Sunday":
                isDayWeekend = true;
                break;
            default:
                isDayWeekend = false;
                System.out.println("invalid entry");
        }
        return isDayWeekend;
    }
}
