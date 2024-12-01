package POP.lesson2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {
        //Declare an object name for the std class,localDate
        LocalDate today;
        //create object for localDate and assign it to today
//        today = new LocalDate();
        //set today's date in variable today
        today = LocalDate.now();
        System.out.println("today" + today);
        //display yesterday date
        LocalDate yesterday = today.minusDays(1);
        today = today.minusDays(1);
        System.out.println("yesterday" + yesterday);
//       // display tomorrow date
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        tomorrow = today.plusDays(1);
        System.out.println("tomorrow" + tomorrow);

        //format today date
        //need an object of type DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("MM/dd/yy");
        System.out.println("format: "+formatter);
        //Create and print date of birth
        LocalDate dateOfBirth = LocalDate.of(2020, 2, 3);
        System.out.println("date of birth: "+dateOfBirth);
    }
}


