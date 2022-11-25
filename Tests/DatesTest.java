import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatesTest {


    @Test
    void standardInput() {
        String[] args = {"1", "2", "3", "4"};
        DatesImproved.main(args);
        assertEquals(61, DatesImproved.daysBetween);
    }
    // Dates.class returns

    @Test
    void negativeValues() {
        String[] args = {"-1", "2", "3", "4"};
        DatesImproved.main(args);
        assertEquals(-1, DatesImproved.daysBetween);
    }
    // Dates.class returns 95

    @Test
    void oneMonth() {
        String[] args = {"1", "1", "2", "1"};
        DatesImproved.main(args);
        assertEquals(31, DatesImproved.daysBetween);
    }
    // Dates.class returns 0

    @Test
    void laterMonthEarlierThanSomeMonth() {
        String[] args = {"4", "3", "2", "1"};
        DatesImproved.main(args);
        assertEquals(304, DatesImproved.daysBetween);
    }
    // Dates.class returns -126

    @Test
    void sameDates(){
        String [] args = {"1", "1", "1", "1"};
        DatesImproved.main(args);
        assertEquals(0, DatesImproved.daysBetween);

    }


    @Test
    void firstToLastDay(){
        String [] args = {"1", "1", "12", "31"};
        DatesImproved.main(args);
        assertEquals(364, DatesImproved.daysBetween);
    }

    @Test
    void firstAndSecondDay(){
        String [] args = {"1", "1", "1", "2"};
        DatesImproved.main(args);
        assertEquals(1, DatesImproved.daysBetween);
    }

    @Test
    void wrongMonth(){
        String [] args = {"13", "1", "1", "2"};
        DatesImproved.main(args);
        assertEquals(-1, DatesImproved.daysBetween);
    }

    @Test
    void firstPosSecNeg(){
        String [] args = {"2", "1", "-2", "1"};
        DatesImproved.main(args);
        assertEquals(-1, DatesImproved.daysBetween);
    }

    @Test
    void daysInMonthJanuary() {
        int result = DatesImproved.daysInMonth(1);
        assertEquals(31, result);
        //Dates.class returns TRUE
    }

    @Test
    void daysInMonthApril() {
        int result = DatesImproved.daysInMonth(4);
        assertEquals(30, result);
        //Dates.class returns FALSE
    }

    @Test
    void daysInMonthFebruary() {
        int result = DatesImproved.daysInMonth(2);
        assertEquals(28, result);
        //Dates.class return FALSE
    }

}