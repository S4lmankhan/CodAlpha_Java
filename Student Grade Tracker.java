import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] grades = new int[numStudents];
        String[] studentNames = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            if (studentNames.length > 0) {
                System.out.print("Enter name for student " + (i + 1) + ": ");
                studentNames[i] = scanner.nextLine();
            }
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        double average = calculateAverage(grades);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);

        int highestIndex = findIndexOfHighest(grades);
        int lowestIndex = findIndexOfLowest(grades);

        System.out.println("\nThe average grade is: " + average);
        System.out.println("The highest grade is: " + highest);

        if (studentNames.length > 0) {
            System.out.println("Student with highest grade: " + studentNames[highestIndex]);
        } else {
            System.out.println("Student with highest grade: Student " + (highestIndex + 1));
        }

        System.out.println("The lowest grade is: " + lowest);

        if (studentNames.length > 0) {
            System.out.println("Student with lowest grade: " + studentNames[lowestIndex]);
        } else {
            System.out.println("Student with lowest grade: Student " + (lowestIndex + 1));
        }

        scanner.close();
    }

    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int findHighest(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int findLowest(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public static int findIndexOfHighest(int[] grades) {
        int highestIndex = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[highestIndex]) {
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    public static int findIndexOfLowest(int[] grades) {
        int lowestIndex = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < grades[lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
}

