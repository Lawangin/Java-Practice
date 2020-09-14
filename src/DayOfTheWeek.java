import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get user year
        System.out.println("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        // get user month
        System.out.println("Enter month: 1-12: ");
        int m = input.nextInt();

        // get user day of month
        System.out.println("Enter the day of the month: 1-31: ");
        int q = input.nextInt();

        // fix january and february
        if (m == 1) {
            m = 13;
            year -= 1;
        } else if (m == 2) {
            m = 14;
            year -= 1;
        }

        // calculate century and year of the century
        int j = year / 100;
        int k = year % 100;

        // calculate day of the week
        // h = (q + 26(m+1)/10 + k + k/4 + j/4 + 5j) % 7
        int h = (q + 26 * (m+1)/10 + k + k/4 + j/4 + 5 * j) % 7;

        // 0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday
        String result;
        switch (h) {
            case 0:
                result = "Saturday";
                break;
            case 1:
                result = "Sunday";
                break;
            case 2:
                result = "Monday";
                break;
            case 3:
                result = "Tuesday";
                break;
            case 4:
                result = "Wednesday";
                break;
            case 5:
                result = "Thursday";
                break;
            case 6:
                result = "Friday";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + h);
        }

        // display result
        System.out.println("Day of the week is " + result);

    }
}