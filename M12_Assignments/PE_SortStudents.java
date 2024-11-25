import java.util.Scanner;

public class PE_SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // Consume the newline character

        // Create arrays for names and scores
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];

        // Read student names and their scores
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            names[i] = input.nextLine();
            System.out.print("Enter student " + (i + 1) + " score: ");
            scores[i] = input.nextInt();
            input.nextLine(); // Consume the newline character
        }

        // Sort the students by their scores in decreasing order
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) { // Swap for descending order
                    // Swap scores
                    int tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    // Swap names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        // Display the student names and scores in decreasing order
        System.out.println("Students sorted by their scores in decreasing order:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
    }
}