import java.util.Scanner;

class ATM {
    int pin;
    float balance;

    ATM(int pin, float balance) {
        this.pin = pin;
        this.balance = balance;
    }

    void withdraw(float amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Amount withdrawn : " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void deposit(float amount) {
        balance += amount;
        System.out.println("Deposit successful.");
        System.out.println("Amount deposited : " + amount);
    }

    void displayBalance() {
        System.out.println("Current Balance : " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM obj = new ATM(1234, 5000.0f);

        int attempts = 0;
        boolean correctPin = false;

        while (attempts < 3) {
            System.out.print("Enter PIN : ");
            int enteredPin = sc.nextInt();

            if (enteredPin == obj.pin) {
                correctPin = true;
                System.out.println("PIN verified successfully.");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");

                if (attempts == 3) {
                    System.out.println("Maximum attempts exceeded.");
                    System.out.println("Account blocked.");
                }
            }
        }

        if (correctPin) {
            int choice;

            do {
                System.out.println("\n--- ATM MENU ---");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Display Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice : ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter withdrawal amount : ");
                        float withdrawAmount = sc.nextFloat();
                        obj.withdraw(withdrawAmount);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount : ");
                        float depositAmount = sc.nextFloat();
                        obj.deposit(depositAmount);
                        break;

                    case 3:
                        obj.displayBalance();
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 4);
        }

        sc.close();
    }
}
