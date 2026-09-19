import java.util.Vector;
import java.util.Scanner;

class Collections9 {

    static String calculateDivision(int marks) {

        if (marks >= 90) {
            return "Outstanding";
        }
        else if (marks >= 75) {
            return "Distinction";
        }
        else if (marks >= 60) {
            return "First Division";
        }
        else if (marks >= 50) {
            return "Second Division";
        }
        else {
            return "Fail";
        }
    }

    static int calculateTotal(Vector<Integer> marks) {

        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        return total;
    }

    static int countPassed(Vector<Integer> marks) {

        int passed = 0;

        for (int mark : marks) {
            if (mark >= 50) {
                passed++;
            }
        }

        return passed;
    }

    static int countFailed(Vector<Integer> marks) {

        int failed = 0;

        for (int mark : marks) {
            if (mark < 50) {
                failed++;
            }
        }

        return failed;
    }

    static void displayResult(Vector<Integer> marks) {

        for (int mark : marks) {
            System.out.println(
                "Marks: " + mark +
                " | Result: " + calculateDivision(mark)
            );
        }

        int totalStudents = marks.size();
        int passedStudents = countPassed(marks);
        int failedStudents = countFailed(marks);
        int totalMarks = calculateTotal(marks);

        double average = (double) totalMarks / totalStudents;

        System.out.println("\n--- Class Summary ---");
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Passed Students: " + passedStudents);
        System.out.println("Failed Students: " + failedStudents);
        System.out.println("Class Average: " + average);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<Integer> marks = new Vector<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            marks.add(sc.nextInt());
        }

        displayResult(marks);

    }
}
