import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get user input
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // calculate the discriminant of quadratic eq, b^2 - 4ac
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // calculate roots of quadratics eq
        // r1 = (-b + sqrt(b^2 - 4ac)) / (2a)
        // r2 = (-b - sqrt(b^2 - 4ac)) / (2a)
        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

        // display results
        String result;
        if (discriminant > 0) {
            result = "The equation has two roots " + r1 + " and " + r2;
        }
        else if (discriminant == 0) {
            result = "The equation has one root " + r1;
        }
        else {
            result = "The equation has no real roots";
        }
        System.out.println(result);
    }
}