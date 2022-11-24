import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DatesTest {


//BranchCoverage
    //for(true) AND while(true)
    @Test
    void mainforTrue() {
        String[] args = {"1", "2", "3", "4"};
        DatesImproved.main(args);
        assertEquals(61, DatesImproved.daysBetween);
        // returns 33
    }
    //for(false) AND while(true)
    @Test
    void mainforFalse() {
    String[] args = {"-1", "2", "3", "4"};
    DatesImproved.main(args);
    // assert throws exception
    assertThrows(NumberFormatException.class, () -> {
        Integer.parseInt(args[0]);
    });
    }


    //while(true) and for(true)
    @Test
    void mainWhileTrue() {
    String[] args = {"1", "1", "2", "1"};
    DatesImproved.main(args);
    assertEquals(31, DatesImproved.daysBetween);
    }
    // returns 0



    //while(false) and for(true)
    @Test
    void mainWhileFalse() {
        String[] args = {"4", "3", "2", "1"};
        DatesImproved.main(args);
        assertEquals(304, DatesImproved.daysBetween);
        // returns -126
    }




    //10 - 36
    @Test
    void daysInMonthJanuary() {
        DatesImproved date = new DatesImproved();
        int result = DatesImproved.daysInMonth(1);
        assertEquals(31, result);
    }

    @Test
    void daysInMonthApril() {
        DatesImproved date = new DatesImproved();
        int result = DatesImproved.daysInMonth(4);
        assertEquals(30, result);
    }

}