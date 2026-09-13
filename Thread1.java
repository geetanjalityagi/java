class BankAccount{
    int balance = 10000;

    synchronized void withdraw(String customer, int amount){
        System.out.println(customer + " wants to withdraw ₹" + amount);

        if (balance >= amount) {
            System.out.println(customer + " is withdrawing money...");

            balance = balance - amount;

            System.out.println(customer + " successfully withdrew ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println(customer + ": Insufficient balance!");
        }
    }
}

class Customer extends Thread{
    BankAccount account;
    String customername;
    int amount;

    Customer(BankAccount account, String customername, int amount){
        this.account = account;
        this.customername = customername;
        this.amount = amount;
    }

    public void run(){
        account.withdraw(customername, amount);
    }
}

public class Thread1{

    public static void main(String arg[]){
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, "Customer 1", 7000);
        Customer c2 = new Customer(account, "Customer 2", 5000);

        c1.start();
        c2.start();
    }
}