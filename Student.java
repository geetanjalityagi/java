class Student {
    int student_id;
    String name;
    String[] courses;
    int count;

    Student(int student_id, String name) {
        this.student_id = student_id;
        this.name = name;
        courses = new String[5];
        count = 0;
    }

    void registerCourse(String course) {
        if (count < 5) {
            courses[count] = course;
            count++;

            System.out.println(course + " registered successfully.");
        } else {
            System.out.println("Maximum 5 courses can be registered.");
        }
    }

    void displayCourses() {
        System.out.println("\nStudent ID : " + student_id);
        System.out.println("Name : " + name);
        System.out.println("Registered Courses:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }
    }

    public static void main(String[] args) {

        Student obj = new Student(101, "Abc");

        obj.registerCourse("Java");
        obj.registerCourse("Python");
        obj.registerCourse("Database");
        obj.registerCourse("Computer Networks");
        obj.registerCourse("Operating System");

        obj.registerCourse("Machine Learning");

        obj.displayCourses();
    }
}
