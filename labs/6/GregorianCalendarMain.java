import java.util.GregorianCalendar;

public class GregorianCalendarMain {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        //To display current date
        System.out.println("Current");
        displayDate(gregorianCalendar);
        
        //To set and display date
        System.out.println("Setting time to 1234567898765L");
        gregorianCalendar.setTimeInMillis(1234567898765L);
        displayDate(gregorianCalendar);
    }

    //Method to get/set year, month and day using GregorianCalendar class
    private static void displayDate(GregorianCalendar gregorianCalendar) {
        System.out.println("Year:\t" + gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("Month:\t" + gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println("Day:\t" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println();
    }
}