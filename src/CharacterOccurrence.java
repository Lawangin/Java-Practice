import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        int result = count(str, ch);
        System.out.println("The number of occurrences of e in We the people is " + result);
    }

    public static int count(String str, char a) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                result++;
            }
        }

        return result;
    }

}