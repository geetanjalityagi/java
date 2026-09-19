import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeBonus {

    static int calculateBonusPercent(int salary) {

        if (salary >= 80000) {
            return 15;
        } 
        else if (salary >= 50000) {
            return 10;
        } 
        else if (salary >= 30000) {
            return 5;
        } 
        else {
            return 0;
        }
    }

    static double calculateBonus(int salary, int bonusPercent) {
        return salary * bonusPercent / 100.0;
    }

    static double calculateRevisedSalary(int salary, double bonus) {
        return salary + bonus;
    }

    static void displayResult(ArrayList<Integer> salaries) {

        for (int salary : salaries) {

            int bonusPercent = calculateBonusPercent(salary);

            double bonus = calculateBonus(salary, bonusPercent);

            double revisedSalary = calculateRevisedSalary(salary, bonus);

            System.out.println("\nSalary: ₹" + salary);
            System.out.println("Bonus: " + bonusPercent + "%");
            System.out.println("Bonus Amount: ₹" + bonus);
            System.out.println("Revised Salary: ₹" + revisedSalary);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> salaries = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter salary of employee " + i + ": ");
            salaries.add(sc.nextInt());
        }

        displayResult(salaries);

        sc.close();
    }
}
