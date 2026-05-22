import homework.WeekDays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

public class WeekDaysTest {

    //  Positive (1–7)
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})
    public void positiveTests(Integer dayNumber) {

        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");

        String expected = daysList.get(dayNumber - 1);
        String actual = WeekDays.getDay(dayNumber);

        assertEquals(expected, actual);
    }

    // Negative test numbers < 1
    @ParameterizedTest
    @ValueSource(ints = {0, -1, -5, -100})
    public void testLessThanOne(Integer dayNumber) {

        String expected = "The number should be equal or larger than 1";
        String actual = WeekDays.getDay(dayNumber);

        assertEquals(expected, actual);
    }

    // Negative test numbers > 7
    @ParameterizedTest
    @ValueSource(ints = {8, 9, 10, 100})
    public void testGreaterThanSeven(Integer dayNumber) {

        String expected = "The number should be equal or smaller than 7";
        String actual = WeekDays.getDay(dayNumber);

        assertEquals(expected, actual);
    }

    // Null test
    @Test
    public void nullTest() {

        assertThrows(NullPointerException.class, () -> {
            WeekDays.getDay(null);
        });
    }
}