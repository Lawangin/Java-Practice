import java.util.Scanner;

public class TwoHighestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables high score, second high score, number of students, student name first, student name second
        double highScore = 0;
        double secondHighScore = 0;
        String firstPlace = "";
        String secondPlace = "";

        // Get user input
        System.out.println("Enter the number of students: ");
        int students = input.nextInt();

        // Calculate high score
        for (int i = students; i > 0; i--) {
            System.out.println("Enter a student name: ");
            String name = input.next();
            System.out.println("Enter a student score: ");
            int score = input.nextInt();

            if (score > highScore) {
                secondHighScore = highScore;
                secondPlace = firstPlace;
                highScore = score;
                firstPlace = name;
            }
            if (score < highScore && score > secondHighScore) {
                secondHighScore = score;
                secondPlace = name;
            }
        }

        // Display results
        System.out.println(firstPlace + "'s score is " + highScore);
        System.out.println(secondPlace + "'s score is " + secondHighScore);
    }
}