class Theatre{
    int availableSeats = 5;

    synchronized void book(String customer, int seats){
        System.out.println(customer + " wants to book " + seats + " seats.");

        if (availableSeats >= seats) {

            System.out.println(customer + " is booking seats...");

            availableSeats = availableSeats - seats;

            System.out.println(customer + " successfully booked " + seats + " seats.");
            System.out.println("Seats remaining: " + availableSeats);

        } else {
            System.out.println(customer + ": Not enough seats available.");
        }
    }
}

class Customer extends Thread{
    Theatre theatre;
    String name;
    int seats;

    Customer(Theatre theatre, String name, int seats){
        this.theatre = theatre;
        this.name = name;
        this.seats = seats;
    }

    public void run(){
        theatre.book(name, seats);
    }
}

public class Thread2{

    public static void main(String arg[]){
        Theatre theatre = new Theatre();

        Customer c1 = new Customer(theatre, "Customer 1", 3);
        Customer c2 = new Customer(theatre, "Customer 2", 1);
        Customer c3 = new Customer(theatre, "Customer 3", 2);

        c1.start();
        c2.start();
        c3.start();
    }
}