import java.util.Stack;

class Collections12{

    static class Student {
        String name;
        double percentage;

        Student(String name, double percentage) {
            this.name = name;
            this.percentage = percentage;
        }
    }

    static int calculateScholarship(double percentage) {

        if (percentage >= 90) {
            return 20000;
        }
        else if (percentage >= 80) {
            return 15000;
        }
        else if (percentage >= 70) {
            return 10000;
        }
        else if (percentage >= 60) {
            return 5000;
        }
        else {
            return 0;
        }
    }

    static void processStudents(Stack<Student> students) {

        while (!students.isEmpty()) {

            Student student = students.pop();

            int scholarship = calculateScholarship(student.percentage);

            System.out.println("\nStudent: " + student.name);
            System.out.println("Percentage: " + student.percentage + "%");
            System.out.println("Scholarship: ₹" + scholarship);
        }
    }

    public static void main(String[] args) {

        Stack<Student> students = new Stack<>();

        students.push(new Student("Rahul", 75));
        students.push(new Student("Anjali", 92));
        students.push(new Student("Aman", 65));
        students.push(new Student("Priya", 85));

        processStudents(students);
    }
}