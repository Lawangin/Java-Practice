import java.util.Scanner;

public class Exercise02_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user's input for 2 points
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y 2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // calculate distance, sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.pow(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0), 0.5);

        // display results
        System.out.println("The distance between the two points is " + distance);
    }
};
