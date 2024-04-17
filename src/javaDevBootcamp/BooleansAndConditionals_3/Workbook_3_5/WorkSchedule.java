package javaDevBootcamp.BooleansAndConditionals_3.Workbook_3_5;

public class WorkSchedule {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int day = 7;   //3rd day of the week...
        boolean holiday = true;

        // IF - ELSE IF - ELSE HERE!
        if (day == 1) {
            holiday = false;
            isHoliday(holiday);
        } else if (day == 2) {
            holiday = false;
            isHoliday(holiday);
        } else if (day == 3) {
            holiday = false;
            isHoliday(holiday);
        } else if (day == 4) {
            holiday = false;
            isHoliday(holiday);
        } else if (day == 5) {
            holiday = false;
            isHoliday(holiday);
        } else if (day == 6) {
            holiday = true;
            isHoliday(holiday);
        } else if (day == 7) {
            holiday = true;
            isHoliday(holiday);
        }

    }

    public static void isHoliday(boolean holiday) {
        if (holiday) {
            System.out.println("Holiday");
        } else {
            System.out.println("Not Holiday");
        }
    }
}