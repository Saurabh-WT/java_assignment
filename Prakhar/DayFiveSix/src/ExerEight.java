
public class ExerEight {
    //Create a Java class named "TimeConverter" with overloaded methods that
    // convert time from hours to minutes and vice versa.
    // Test the methods with different input values.

    public static void main(String[] args) {
        try {

            System.out.println("Example of hour to min conversion");
            TimeConverter tc = new TimeConverter();
            System.out.println("2 hour, 300 min and 100 sec to only minutes: " + tc.hourToMinute(2, 300, 100));
            System.out.println("3 hour 100 min to only minutes: " + tc.hourToMinute(3, 100));
            System.out.println("2 hour to only minutes: " + tc.hourToMinute(2));


            System.out.println();
            System.out.println("Example of min to hour conversion");
            System.out.println("2 hour, 300 min and 100 sec to only Hours: " + tc.minuteToHour(2, 300, 100));
            System.out.println("3 hour 100 min to only Hours: " + tc.minuteToHour(3, 100));
            System.out.println("360 minutes to only Hours: " + tc.minuteToHour(2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

class TimeConverter {
    int hourToMinute(int hour, int min, int sec) {
        return (hour * 60) + min + (sec / 60);
    }

    int hourToMinute(int hour, int min) {
        return (hour * 60) + min;
    }

    int hourToMinute(int hour) {
        return (hour * 60);
    }

    int minuteToHour(int hour, int min, int sec) {
        return (min / 60) + hour + ((sec / 60) / 60);

    }

    int minuteToHour(int hour, int min) {
        return (min / 60) + hour;

    }

    int minuteToHour(int min) {
        return min / 60;
    }
}
