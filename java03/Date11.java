package java03;

import java.time.LocalDate;
import java.util.Scanner;
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class Date11 {
    public static void printDay(Day day) {
        switch (day) {
            case SUNDAY:
                System.out.println("It's Sunday!");
                break;
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday!");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        Day currentDay = Day.values()[currentDate.getDayOfWeek().getValue() % 7];
        System.out.println("Today is: " + currentDay + " Do you want to book a appointment after 30 days? (yes/no)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            if (currentDate.plusDays(30).getDayOfWeek().getValue() == 6 ) {
                System.out.println("Appointment booked on: " + currentDate.plusDays(32));
            } else if (currentDate.plusDays(30).getDayOfWeek().getValue() == 7) {
                System.out.println("Appointment booked on: " + currentDate.plusDays(31));
            }
            else {
                System.out.println("Appointment booked on: " + currentDate.plusDays(30));
            }
        } 
        else {
            System.out.println("No appointment booked.");
        }
    }

    
}

    

