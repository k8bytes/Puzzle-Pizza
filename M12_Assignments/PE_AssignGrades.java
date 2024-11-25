import java.util.Scanner;

public class PE_AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create an array to store the scores
        int[] scores = new int[numStudents];

        // Prompt the user to enter all scores
        System.out.println("Enter " + numStudents + " scores: ");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = input.nextInt();
        }

        // Find the best score
        int best = 0;
        for (int score : scores) {
            if (score > best) {
                best = score;
            }
        }

        // Assign and display grades
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            char grade;

            if (score >= best - 10) {
                grade = 'A';
            } else if (score >= best - 20) {
                grade = 'B';
            } else if (score >= best - 30) {
                grade = 'C';
            } else if (score >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Student " + i + " score is " + score + " and grade is " + grade);
        }
    }
}