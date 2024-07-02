import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter the grade for student %d: ", i + 1);
            grades[i] = input.nextInt();
        }

        // Calculating average
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        double average = total / numStudents;

        // Finding highest and lowest scores
        int highest = grades[0];
        int lowest = grades[0];
        for (int i = 1; i < numStudents; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        
        input.close();
    }
}
