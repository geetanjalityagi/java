interface Payment {
    void pay(float amount);
}

class CreditCard implements Payment {

    public void pay(float amount) {
        System.out.println("Payment of ₹" + amount + " made using Credit Card.");
    }
}

class UPI implements Payment {

    public void pay(float amount) {
        System.out.println("Payment of ₹" + amount + " made using UPI.");
    }
}

class NetBanking implements Payment {

    public void pay(float amount) {
        System.out.println("Payment of ₹" + amount + " made using Net Banking.");
    }
}

class PaymentSystem {

    public static void main(String[] args) {

        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        Payment p3 = new NetBanking();

        p1.pay(5000.0f);
        p2.pay(2500.0f);
        p3.pay(7500.0f);
    }
}
