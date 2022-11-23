class Dates {
    Dates() {
    }

    public static int daysInMonth(int month) {
        return month != 9 && month != 7 && month != 6 && month != 11 ? 31 : 30;
    }

    public static void main(String[] args) {
        int someMonth = Integer.parseInt(args[0]);
        int someDay = Integer.parseInt(args[1]);
        int laterMonth = Integer.parseInt(args[2]);
        int laterDay = Integer.parseInt(args[3]);
        int someDayInYear = 0;
        int laterDayInYear = 0;

        int aMonth;
        for(aMonth = 0; aMonth < someMonth; ++aMonth) {
            someDayInYear += daysInMonth(aMonth);
        }

        while(aMonth < laterMonth) {
            laterDayInYear += daysInMonth(aMonth);
            ++aMonth;
        }

        int daysBetween = false;
        System.out.println("The difference in days between " + someMonth + "/" + someDay + " and " + laterMonth + "/" + laterDay + " is: ");
        int daysBetween = laterDayInYear - someDayInYear;
        daysBetween = daysBetween + laterDay - someDay;
        System.out.println(daysBetween);
    }
}

