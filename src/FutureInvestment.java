import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount invested: ");
        int investAmount = input.nextInt();
        System.out.println("Annual interest rate:");
        double interestRate = input.nextDouble();

        double monthlyInterestRate = (interestRate / 100) / 12;

        for (int i = 1; i < 31; i++) {
            double result = futureInvestmentValue(investAmount, monthlyInterestRate, i);
            System.out.println(i + " " + result);
        }

    }

    // calculate future investment, futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears * 12)
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }


}