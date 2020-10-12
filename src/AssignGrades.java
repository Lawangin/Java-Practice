import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int length = input.nextInt();
        int[] students = new int[length];
        System.out.println("Enter 4 scores: ");
        int max = 0;
        for (int k = 0; k < students.length; k++) {
            students[k] = input.nextInt();
            if (students[k] > max) {
                max = students[k];
            }
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] >= max - 10) {
                System.out.println("Student " + i + " score is " + students[i] + " and grade is A");
            } else if (students[i] >= max - 20) {
                System.out.println("Student " + i + " score is " + students[i] + " and grade is B");
            } else if (students[i] >= max - 30) {
                System.out.println("Student " + i + " score is " + students[i] + " and grade is C");
            } else if (students[i] >= max - 40) {
                System.out.println("Student " + i + " score is " + students[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + students[i] + " and grade is F");
            }
        }
    }
}