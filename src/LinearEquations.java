import java.util.Scanner;

public class LinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get user input
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // check to see if no solution, ad - bc = 0
        double noSolutionResult = (a * d) - (b * c);
        boolean isNoSolution = noSolutionResult == 0;

        /*
        * use cramer's formula
        * ax + by = e
        * cx + dy = f
        * x = (ed - bf) / (ad -bc)
        * y = (af - ec) / (ad - bc)
        */
        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);

        // display results
        if (isNoSolution) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("x is " + x + " and " + " y is " + y);
        }
    }
}