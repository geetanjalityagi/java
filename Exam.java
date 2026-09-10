import java.util.Scanner; 
public class StudentResult { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        try{
            System.out.print("Enter number of subjects: "); 
            int n = sc.nextInt(); 
            int total = 0; 
            for (int i = 1; i <= n; i++){ 
                System.out.print("Enter marks for subject " + i + ": "); 
                
                int marks = sc.nextInt(); 
                
                if (marks < 0 || marks > 100){
                    throw new Exception("Marks must be between 0 and 100"); 
                } 
                
                total = total + marks; 
            } 
            
            double average = total / n; 
            
            System.out.println("Average marks = " + average); 
        } 
        
        catch (ArithmeticException e){ 
            System.out.println("Error: Cannot divide by zero"); 
        } 
        
        catch (java.util.InputMismatchException e){ 
            System.out.println("Error: Invalid input! Enter numbers only"); 
        } 
        
        catch (Exception e) { System.out.println("Error: " + e.getMessage()); 
        } 
         
    } 
}