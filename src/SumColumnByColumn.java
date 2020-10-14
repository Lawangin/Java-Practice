import java.util.Arrays;
import java.util.Scanner;

public class SumColumnByColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] matrix = new double[3][4];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();

        for (int k = 0; k < matrix[0].length; k++) {
            double sum = sumColumn(matrix, k);
            System.out.println("Sum of the elements at column " + k + " is " + sum);
        }
    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
