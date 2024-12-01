package selection;

import java.util.Scanner;

enum Day {//for constant value like day name, direction name// always capital
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of week: ");
// use a try-catch block to validate the user's input

               Day day = Day.valueOf(scanner.next().toUpperCase());

            // Switch case to handle different days
            switch (day) {
                case MONDAY:
                    System.out.println("Day: " + day + " - Start of the work week.");
                    break;
                case TUESDAY:
                    System.out.println("Day: " + day + " - Second day of the week.");

                case WEDNESDAY:
                    System.out.println("Day: " + day + " - Midweek day.");
                    break;
                case THURSDAY:
                    System.out.println("Day: " + day + " - Almost the weekend.");
                    break;
                case FRIDAY:
                    System.out.println("Day: " + day + " - Last work day of the week.");
                    break;
                case SATURDAY:
                    System.out.println("Day: " + day + " - Weekend is here!");
                    break;
                case SUNDAY:
                    System.out.println("Day: " + day + " - Rest day.");
                    break;
                default:
                    System.out.println("Invalid day.");
        }
    }
}