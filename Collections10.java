import java.util.Stack;

class Collections19{

    static int balance = 20000;

    static void withdraw(Stack<Integer> transactions, int amount) {

        if (amount <= balance) {

            balance = balance - amount;
            transactions.push(amount);

            System.out.println("Withdrawal of ₹" + amount + " successful.");
            System.out.println("Remaining Balance: ₹" + balance);

        } else {

            System.out.println("Withdrawal of ₹" + amount + " failed.");
            System.out.println("Insufficient balance.");
        }
    }

    static void latestTransaction(Stack<Integer> transactions) {

        if (!transactions.isEmpty()) {
            System.out.println("\nLatest Successful Transaction: ₹"
                    + transactions.peek());
        } else {
            System.out.println("No successful transactions.");
        }
    }

    public static void main(String[] args) {

        Stack<Integer> transactions = new Stack<>();

        withdraw(transactions, 5000);
        withdraw(transactions, 3000);
        withdraw(transactions, 8000);
        withdraw(transactions, 6000);

        latestTransaction(transactions);
    }
}
