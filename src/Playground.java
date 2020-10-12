import java.util.Arrays;
import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        String str = "SOMETHING!";
        // str.charAt(0)

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(i - j));
            }
            System.out.println("!");
        }

    }

}