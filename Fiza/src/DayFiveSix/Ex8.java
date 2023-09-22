package DayFiveSix;

import static DayFiveSix.TimeConverter.hoursToMin;
import static DayFiveSix.TimeConverter.minToHour;

class TimeConverter{
    //function for hours to minutes
    public static int hoursToMin(int hours) {
        if(hours*60<0){
            System.out.println("Please enter a positive value");
        }
        return hours * 60;

        }
    public static double hoursToMin(double hours) {
        if(hours*60.0<0){
            System.out.println("Please enter a positive value");
        }
        return hours * 60.0;
    }

    //function for minutes to hour
    public static double minToHour(double minutes){
        if(minutes/60.0<0){
            System.out.println("Please enter a positive value");
        }
        return minutes/60.0;
    }
    public static int minToHour(int minutes){
        if(minutes/60<0){
            System.out.println("Please enter a positive value");
        }
        return minutes/60;
    }

}
public class Ex8 {
    public static void main(String[] args) {
        System.out.println(hoursToMin(-7));
//        System.out.println(hoursToMin(2.66));
//        System.out.println(minToHour(400));
//        System.out.println(minToHour(400.500));

    }
}
