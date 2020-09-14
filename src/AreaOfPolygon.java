import java.util.Scanner;

public class AreaOfPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get user inputs
        System.out.println("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.println("Enter the length of the side: ");
        double length = input.nextDouble();

        // area = n * s ^ 2 / (4 * tan(pi / n))
        // s is the length of a side.
        double area = sides * Math.pow(length, 2) / (4 * Math.tan(Math.PI / sides));

        // display output
        System.out.println("The area of the polygon is " + area);
    }
}