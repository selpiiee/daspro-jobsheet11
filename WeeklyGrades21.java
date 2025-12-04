
import java.util.Scanner;

public class WeeklyGrades21 {

    public static int[][] inputGrades(int student, int week) {
        Scanner sc = new Scanner(System.in);
        int[][] grades = new int[student][week];

        System.out.println("\nInput Student Grades");

        for (int i = 0; i < student; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            for (int j = 0; j < week; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = sc.nextInt();
            }
        }
        return grades;
    }

    public static void displayAll(int[][] grades) {
        System.out.println("\nAll Student Grades");

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] findWeekWithHighestGrade(int[][] grades) {
        int Highest = 0;
        int weekIndex = 0;

        for (int week = 0; week < grades[0].length; week++) {
            for (int student = 0; student < grades.length; student++) {
                if (grades[student][week] > Highest) {
                    Highest = grades[student][week];
                    weekIndex = week;
                }
            }
        }
        return new int[]{weekIndex + 1, Highest};
    }

    public static void findStudentWithHighestTotal(int[][] grades) {
        int highestTotal = 0;
        int bestStudentIndex = 0;

        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j ++) {
                sum += grades[i][j];
            }
            if (sum > highestTotal) {
                highestTotal = sum;
                bestStudentIndex = i;
            }
        }
        System.out.println("\nSTUDENT WITH HIGHEST TOTAL SCORE");
        System.out.println("Student: " + (bestStudentIndex + 1));
        System.out.println("Total score: " + highestTotal);

        System.out.print("Weekly Grades: ");
        for (int j = 0; j < grades[bestStudentIndex].length; j++) {
            System.out.print(grades[bestStudentIndex][j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int students = sc.nextInt();

        System.out.print("Input number of weeks: ");
        int weeks = sc.nextInt();

        int [][] grades = inputGrades(students, weeks);

        displayAll(grades);

        int[] result = findWeekWithHighestGrade(grades);
        System.out.println("\nThe week with the highest grade is: Week " + result[0]);
        System.out.println("Highest score in that week: " + result[1]);

        findWeekWithHighestGrade(grades);
    }
}
