import java.util.ArrayList;
import java.util.Scanner;

class Collections5{

    static int calculateTotal(ArrayList<Integer> prices){
        int total = 0;

        for(int price : prices){
            total += price;
        }

        return total;
    }

    static int calculatediscount(int total){
        if(total >= 10000){
            return 20;
        }
        else if(total >= 5000){
            return 10;
        }
        else if(total >= 2000){
            return 5;
        }
        else{
            return 0;
        }
    }

    static double discountamount(int discount, int total){
        return total*discount/100.0;
    }

    static double totalamount(int total, double disAmount){
        return total - disAmount;
    }

    static void displayResult(ArrayList<Integer> prices){
        int total = calculateTotal(prices);
        int discountPercent = calculatediscount(total);
        double discount = discountamount(discountPercent, total);
        double finalAmount = totalamount(total, discount);

        System.out.println("Total Amount: ₹" + total); 
        System.out.println("Discount: " + discountPercent + "%"); 
        System.out.println("Discount Amount: ₹" + discount); 
        System.out.println("Final Payable Amount: ₹" + finalAmount);
    }

    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> prices = new ArrayList<>(); 

        System.out.print("Enter number of products: "); 
        int n = sc.nextInt(); 

        for (int i = 1; i <= n; i++){ 
            System.out.print("Enter price of product " + i + ": "); 
            prices.add(sc.nextInt()); 
        } 
        
        displayResult(prices);
    }
}