import java.util.Scanner;

public class WeekDay {
    static void whichWeekDay(int day) {
        String weekDay;
        switch(day){
            case 1:
            weekDay="Monday";
            break;
            case 2:
            weekDay="Tuesday";
            break;
            case 3:
            weekDay="Wednesday";
            break;
            case 4:
            weekDay="Thursday";
            break;
            case 5:
            weekDay="Friday";
            break;
            case 6:
            weekDay="Saturday";
            break;
            case 7:
            weekDay="Sunday";
            break;
            default:
            weekDay="Invalid";
        }
        System.out.print(weekDay);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Number of day: ");
        int num=sc.nextInt();

        whichWeekDay(num);
    }
}
