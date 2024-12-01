
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian { // Class definition
    public static void main(String[] args) {
        // Creating a GregorianCalendar object for the current date and time
        GregorianCalendar gc = new GregorianCalendar();

        // Print out the current date
        System.out.println("Current POP.lesson2.Date:");
        System.out.println(gc.get(Calendar.YEAR) + "_" +
                (gc.get(Calendar.MONTH) + 1) + "_" + // Add 1 to MONTH to get the correct month value
                gc.get(Calendar.DAY_OF_MONTH));

        // Create a new GregorianCalendar object for a specific date and time
        GregorianCalendar meetingInfo = new GregorianCalendar(2024, Calendar.OCTOBER, 10, 15, 30);

        // Print out the specific meeting date and time
        System.out.println("Meeting POP.lesson2.Date and Time:");
        System.out.println((meetingInfo.get(Calendar.MONTH) + 1) + "-" +
                meetingInfo.get(Calendar.DAY_OF_MONTH) + "-" +
                meetingInfo.get(Calendar.YEAR) + " at " +
                String.format("%02d:%02d", meetingInfo.get(Calendar.HOUR_OF_DAY), meetingInfo.get(Calendar.MINUTE)));
    }
}