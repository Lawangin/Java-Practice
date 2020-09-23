import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter year and month
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter a month: ");
        String month = input.next();

        // Determine days in the selected month
        int days;
        switch (month) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                days = 31;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                days = 30;
                break;
            case "Feb":
                days = 28;
                break;
            default:
                days = 0;
                break;
        }

        // Determine if it is a leap year
        boolean leapYear;
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            leapYear = true;
        } else if (year % 4 == 0 && year % 100 ==0) {
            leapYear = false;
        } else leapYear = year % 4 == 0;

        if (month.equals("Feb") && leapYear) {
            days = 29;
        }

        // Display output
        if (days == 0) {
            System.out.println(month + " is not a correct month name");
        } else {
            System.out.println(month + " " + year + " has " + days + " days");
        }
    }
}