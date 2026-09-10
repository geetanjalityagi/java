import java.util.*;
public class withdrawl {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter balance: ");
            int balance=sc.nextInt();

            sc.nextLine();

            System.out.println("Enter amount : ");
            int amount=sc.nextInt();

            sc.nextLine();

            if(amount > balance){
                System.out.println("Insufficient balance");
            }
            else{
                System.out.println("Withdrwal successful. Remaining balance: " +
                (balance-amount));
                balance=balance-amount;
            }
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}