import java.util.Stack;
import java.util.Scanner;

class Collections11{

    static final int CAPACITY = 5;

    static void addCar(Stack<String> cars, String car) {

        if (cars.size() < CAPACITY) {
            cars.push(car);
            System.out.println(car + " parked successfully.");
        }
        else {
            System.out.println("Parking is full. " + car + " cannot enter.");
        }
    }

    static void removeCar(Stack<String> cars) {

        if (!cars.isEmpty()) {
            String car = cars.pop();
            System.out.println(car + " has left the parking.");
        }
        else {
            System.out.println("Parking is empty.");
        }
    }

    static void displayCars(Stack<String> cars) {

        System.out.println("\nRemaining Cars:");

        if (cars.isEmpty()) {
            System.out.println("No cars in parking.");
        }
        else {
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }

    static int calculateCharges(int hours) {

        if (hours <= 2) {
            return 50;
        }
        else {
            return 50 + (hours - 2) * 20;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> cars = new Stack<>();

        addCar(cars, "Car1");
        addCar(cars, "Car2");
        addCar(cars, "Car3");
        addCar(cars, "Car4");
        addCar(cars, "Car5");
        addCar(cars, "Car6");

        removeCar(cars);

        displayCars(cars);

        System.out.print("\nEnter parking hours: ");
        int hours = sc.nextInt();

        int charge = calculateCharges(hours);

        System.out.println("Parking Charge: ₹" + charge);

        sc.close();
    }
}