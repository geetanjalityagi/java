import java.util.Vector;
import java.util.Scanner;

class Collections7{

    static double calculateamount(int units){
        double bill = 0; 

        if(units <= 100){ 
            bill = units * 2; 
        } 
        else if(units <= 200){ 
            bill = (100 * 2) + ((units - 100) * 3); 
        } 
        else{ 
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5); 
        } 
        
        return bill;
    }

    static double calculateSurcharge(double amount){
        if(amount > 1000){
            return amount*10/100;
        }

        return 0;
    }

    static void displayResult(Vector<Integer> units){
        for(int unit : units){

            double amount = calculateamount(unit);
            double surcharge = calculateSurcharge(amount);

            double totalbill = amount + surcharge;

            System.out.println("\nUnits Consumed: " + unit); 
            System.out.println("Bill Amount: ₹" + amount); 
            System.out.println("Surcharge: ₹" + surcharge); 
            System.out.println("Final Bill: ₹" + totalbill);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> units = new Vector<>();

        System.out.println("Enter no of customers : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print("Enter units consumed by customer " + i + ": "); 
            units.add(sc.nextInt());
        }

        displayResult(units);
    }
}