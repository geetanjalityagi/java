import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collections3{
    public static void main(String[] args) {

        ArrayList<Integer> salaries = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary: ");
            salaries.add(sc.nextInt());
        }

        System.out.println("\nAll Salaries:");
        for (int salary : salaries) {
            System.out.println(salary);
        }

        int highest = Collections.max(salaries);

        int total = 0;
        for (int salary : salaries) {
            total = total + salary;
        }

        double average = (double) total / salaries.size();

        System.out.println("\nHighest Salary: " + highest);
        System.out.println("Total Salary: " + total);
        System.out.println("Average Salary: " + average);

        sc.close();
    }
}
