import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

       
        double[] scores = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < numSubjects; i++) {
            total += scores[i];
        }
        double average = total / numSubjects;

        String grade = getGrade(average);

        
        System.out.println("\nStudent Score Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String getGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
