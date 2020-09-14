import java.util.Scanner;

public class CalculateFutureInvestment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user inputs for investment, interest rate, years
        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterestPercentage = input.nextDouble();
        System.out.println("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        // calculate future investment, futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears * 12)
        double monthlyInterestRate = (annualInterestPercentage / 100) / 12;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, (numberOfYears * 12));
        double scale = Math.pow(10, 2);
        futureInvestmentValue = Math.round(futureInvestmentValue * scale) / scale;

        // display results
        System.out.println("Future value is " + futureInvestmentValue);
    }
};
