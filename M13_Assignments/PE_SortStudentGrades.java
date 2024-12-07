import java.util.Arrays;

public class PE_SortStudentsGrades {
    /** Main method */
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Array to store student indices and their scores
        int[][] studentScores = new int[answers.length][2];

        // Grade all answers and store scores
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            studentScores[i][0] = i; // Student index
            studentScores[i][1] = correctCount; // Correct count
        }

        // Sort the array by scores
        Arrays.sort(studentScores, (a, b) -> Integer.compare(a[1], b[1]));

        // Display students in increasing order of their scores
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println("Student " + studentScores[i][0] +
                "'s correct count is " + studentScores[i][1]);
        }
    }
}