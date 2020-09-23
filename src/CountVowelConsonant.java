import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.toLowerCase().charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter =='o' || letter =='u') {
                System.out.println(letter);
                vowelCount++;
            } else if (letter != ' '){
                System.out.println(letter);
                consonantCount++;
            }
        }

        System.out.println("The number of vowels is " + vowelCount);
        System.out.println("The number of consonant is " + consonantCount);
    }
}