public class DatesImproved {
    public static int daysBetween;

    /* Precondition: month is between 1 and 12, inclusive */
    /* Postcondition: returns the number of days in the given month */
    public static int daysInMonth (int month) {
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            return 30;
        }
        else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
            return 31;
        }
        else
            return 28;
    }
    public static void main (String[] args) {
        int someMonth, someDay;
        int laterMonth, laterDay;

        // Parse the command line arguments and assign them to the variables above,
        // if there's a faulty input then print an error message and return -1.
        someMonth = Integer.parseInt(args[0]);
        if (someMonth < 1 || someMonth > 12) {
            System.out.println("Invalid month: " + someMonth);
            daysBetween = -1;
            return;
        }
        someDay = Integer.parseInt(args[1]);
        if (someDay < 1 || someDay > daysInMonth(someMonth)) {
            System.out.println("Invalid day: " + someDay);
            daysBetween = -1;
            return;
        }
        laterMonth = Integer.parseInt(args[2]);
        if (laterMonth < 1 || laterMonth > 12) {
            System.out.println("Invalid month: " + laterMonth);
            daysBetween = -1;
            return;
        }
        laterDay = Integer.parseInt(args[3]);
        if (laterDay < 1 || laterDay > daysInMonth(laterMonth)) {
            System.out.println("Invalid day: " + laterDay);
            daysBetween = -1;
            return;
        }

        //while loop for each month between someMonth and laterMonth
        // ensures that we can loop around the year
        daysBetween = 0;
        int currentMonth = someMonth;
        while (currentMonth != laterMonth) {
            daysBetween += daysInMonth(currentMonth);
            if (currentMonth == 12) {
                currentMonth = 1;
            }
            else {
                currentMonth++;
            }
        }

        /* The answer */

        daysBetween = daysBetween + laterDay - someDay;

        System.out.println("The difference in days between " +
                someMonth + "/" + someDay + " and " +
                laterMonth + "/" + laterDay + " is: ");

        System.out.println(daysBetween);
    }
}
