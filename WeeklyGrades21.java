
public class WeeklyGrades21 {

    public static int[][] inputGrades() {
        return new int[][]{
            {20, 19, 25, 20, 10, 0, 10}, {30, 30, 40, 10, 15, 20, 25}, {5, 0, 20, 25, 10, 5, 45}, {50, 0, 7, 8, 0, 30, 60}, {15, 10, 16, 15, 10, 10, 5}
        };
    }

    public static void displayAll(int[][] grades, String[] names) {
        System.out.println("----- All Student Grades -----");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i] + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static int findWeekWithHighestGrade(int[][] grades) {
        int highest = 0;
        int weekIndex = 0;

        for (int week = 0; week < 7; week++) {
            for (int student = 0; student < 5; student++) {
                if (grades[student][week] > highest) {
                    highest = grades[student][week];
                    weekIndex = week;
                } 
            }
        }
        return weekIndex + 1;
    }

    public static void findStudentWithHighestTotal(int[][] grades, String[] names) {
        int highestTotal = 0;
        int bestStudentIndex = 0;

        for (int i = 0; i < grades.length; i++) {
            int Total = 0;
            for (int j = 0; j < grades[i].length; j++) {
                Total += grades[i][j];
            }

            if (Total > highestTotal) {
                highestTotal = Total;
                bestStudentIndex = i;
            }
        }
        System.out.println("\n----- Student With Highest Total Grade -----");
        System.out.println("Name: " + names[bestStudentIndex]);
        System.out.println("Total: " + highestTotal);

        System.out.println("Weekly grades: ");
        for (int j = 0; j < grades[bestStudentIndex].length; j++) {
            System.out.print(grades[bestStudentIndex][j] + "   ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] names = {"Sari", "Rina", "Yuni", "Dwi", "Lusi"};

        int[][] grades = inputGrades();

        displayAll(grades, names);

        int week = findWeekWithHighestGrade(grades);
        System.out.println("\nThe week with highest grade is: Week " + week);

        findStudentWithHighestTotal(grades, names);
    }
}
