import java.util.ArrayList;
import java.util.Scanner;

class Collections4{

    static int calculateTotal(ArrayList<Integer> marks){
        int total = 0;

        for(int mark : marks){
            total += mark;
        }

        return total;
    }

    static double calculatePercentage(int total){
        return total/5.0;
    }

    static String calculateGrade(double percentage){
        if(percentage >= 90){
            return "A";
        }
        else if(percentage >= 75){
            return "B";
        }
        else if(percentage >= 60){
            return "C";
        }
        else if(percentage >= 50){
            return "D";
        }
        else{
            return "Fail";
        }
    }

    static void displayResult(ArrayList<Integer> marks){
        int total = calculateTotal(marks);
        double percentage = calculatePercentage(total);
        String grade = calculateGrade(percentage);

        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade : " + grade);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter name : ");
        String name = sc.nextLine();

        for(int i=1; i<=5; i++){
            System.out.println("Enter marks of " + i + " subject : ");
            marks.add(sc.nextInt());
        }

        displayResult(marks);
    }
}