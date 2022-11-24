import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatesTest {

//BranchCoverage
    @Test
    void mainforTrue() {
        String[] args = {"1", "2", "3", "4"};
        DatesImproved.main(args);
        assertEquals(61, DatesImproved.daysBetween);
        // returns 33
    }

    @Test
    void mainforFalse() {
    String[] args = {"-1", "2", "3", "4"};
    DatesImproved.main(args);
    assertEquals(-1, DatesImproved.daysBetween);
    }

    @Test
    void mainWhileTrue() {
    String[] args = {"1", "1", "2", "1"};
    DatesImproved.main(args);
    assertEquals(31, DatesImproved.daysBetween);
    }
    // returns 0


    @Test
    void mainWhileFalse() {
        String[] args = {"4", "3", "2", "1"};
        DatesImproved.main(args);
        assertEquals(304, DatesImproved.daysBetween);
        // returns -126
    }

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
        //TRUE
    }

    @Test
    void daysInMonthApril() {
        int result = DatesImproved.daysInMonth(4);
        assertEquals(30, result);
        //FALSE
    }

    @Test
    void daysInMonthFebruary() {
        int result = DatesImproved.daysInMonth(2);
        assertEquals(28, result);
        //FALSE
    }

}