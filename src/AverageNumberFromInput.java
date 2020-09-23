import java.util.Scanner;

public class AverageNumberFromInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables positives, negatives, total, and average
        int positives = 0;
        int negatives = 0;
        double total = 0;
        double average;

        // Enter integers
        System.out.println("Enter an integer, the input ends if it is 0: ");
        int userInt = input.nextInt();

        // Loop that quits on 0
        while (userInt != 0) {
            // Calculate positives, negatives, total, and average
            if (userInt < 0) {
                negatives++;
            } else {
                positives++;
            }
            total += userInt;

            userInt = input.nextInt();
        }

        // Output average
        if (positives == 0 && negatives == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            average = total / (positives + negatives);

            System.out.println("The number of positives is " + positives);
            System.out.println("The number of negatives is " + negatives);
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        }
    }
}