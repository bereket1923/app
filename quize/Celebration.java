package quize;

import java.time.LocalDate;
import java.time.Month;

public class Celebration {

    public static void main(String[] args) {
        // Create a LocalDate object for July 4, 1776
        LocalDate independenceDay = LocalDate.of(1776, 7, 4);

        // Get the day, month, and year from the LocalDate object/simply getter methods
        //return value int,int and month(enum b/s month represents 12 type of month)
        int day = independenceDay.getDayOfMonth();
        Month month = independenceDay.getMonth();//or t0 become integer replace getMonth by getMonthValue
        int year = independenceDay.getYear();

        // Display a message celebrating USA's Independence Day
        System.out.println("On " + month + " " + day + ", " + year +
                ", the USA declared its independence from Britain. Let's celebrate freedom!");
    }
}