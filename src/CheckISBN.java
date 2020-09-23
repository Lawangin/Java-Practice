import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lastNumber = 0;
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.nextLine();

        if (isbn.length() != 12) {
            System.out.println("invalid input");
        } else {
            for (int i = 0; i < isbn.length(); i++) {
                int temp = 1;
                if (i % 2 == 0) {
                    temp = 3;
                }
                // total
                lastNumber += (Integer.parseInt(isbn.substring(i, i+1)) * temp);
            }

            lastNumber = 10 - lastNumber % 10;

            if (lastNumber == 10) {
                lastNumber = 0;
            }

            System.out.println("The ISBN-13 number is " + isbn + lastNumber);


        }
    }
}