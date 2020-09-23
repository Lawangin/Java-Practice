import java.util.Scanner;

public class SSNValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;

        // Enter user input
        System.out.println("Enter a SSN: ");
        String ssn = input.next();

        // Check validation
        String[] ssnNumList = ssn.split("-");
        if (ssnNumList.length == 3) {
            int firstEl = 0;
            int secondEL = 0;
            int thirdEl = 0;

            for(int i = 0; i < ssnNumList[0].length(); i++) {
                if (Character.isDigit(ssnNumList[0].charAt(i))) {
                    firstEl++;
                }
            }

            for(int i = 0; i < ssnNumList[1].length(); i++) {
                if (Character.isDigit(ssnNumList[1].charAt(i))) {
                    secondEL++;
                }
            }

            for(int i = 0; i < ssnNumList[2].length(); i++) {
                if (Character.isDigit(ssnNumList[2].charAt(i))) {
                    thirdEl++;
                }
            }

            if (firstEl == 3 && secondEL == 2 && thirdEl == 4) {
                valid = true;
            }
        }

        // Display output
        if (valid) {
            System.out.println(ssn + " is an valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }
    }
}