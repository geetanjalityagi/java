import java.util.Vector;
import java.util.Scanner;

class Collections8 {

    static double calculateFare(int age) {

        if (age < 5) {
            return 0;
        }
        else if (age <= 12) {
            return 500 * 0.50;
        }
        else if (age <= 59) {
            return 500;
        }
        else {
            return 500 * 0.70;
        }
    }

    static void displayResult(Vector<Integer> ages) {

        for (int age : ages) {

            double fare = calculateFare(age);

            System.out.println("\nAge: " + age);
            System.out.println("Fare: ₹" + fare);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<Integer> ages = new Vector<>();

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter age of passenger " + i + ": ");
            ages.add(sc.nextInt());
        }

        displayResult(ages);

        sc.close();
    }
}
