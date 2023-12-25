import java.util.Scanner;

public class Termwork8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();

        char grade = calculateLetterGrade(score);
        System.out.println("Letter grade: " + grade);
    }

    public static char calculateLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

