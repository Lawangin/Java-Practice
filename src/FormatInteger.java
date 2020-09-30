import java.util.Scanner;

public class FormatInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int x = input.nextInt();
        System.out.println("Enter the width: ");
        int w = input.nextInt();

        System.out.println("The formatted number is " + format(x, w));
    }

    public static String format(int number, int width) {
        String num = Integer.toString(number);
        int digits = 0;
        if (num.length() < width) {
            digits = width - num.length();
        }

        for (int i = 1; i <= digits; i++) {
            num = "0" + num;
        }
        return num;
    }

}