import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get user input
        System.out.println("Enter a letter: ");
        String letter = input.next();

        // check if vowel or consonant
        String result;
        switch (letter.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                result = "is a vowel";
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                result = "is a consonant";
                break;
            default:
                result = "is an invalid input";
                break;
        }

        // display results
        System.out.println(letter + " " + result);
    }
}