//Write a method to compute the following series:
//
//        m(i) = 1/2 + 2/3 +......+ i/(i+1)

public class SumSeries {
    public static void main(String[] args) {
        m(20);
    }

    public static void m(int i) {
        double result = 0;
        for (double j = 1; j <= i; j++) {
            result += (j / (j+1));
            System.out.printf("%.0f %.4f\n", j, result);
        }
    }
}