package homework;

import java.util.ArrayList;

public class WeekDays {

    public static String getDay(Integer dayNumber) {

        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");
        daysList.add("Saturday1");

        if (dayNumber == null) {
            throw new NullPointerException();
        }

        if (dayNumber < 1) {
            return "The number should be equal or larger than 1";
        }

        if (dayNumber > 7) {
            return "The number should be equal or smaller than 7";
        }

        return daysList.get(dayNumber - 1);
    }
}