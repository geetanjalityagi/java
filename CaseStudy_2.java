class CaseStudy_2{
    int acc_no;
    String acc_name;
    float balance;

    CaseStudy_2(int acc_no,String  acc_name,float balance){
        this.acc_no = acc_no;
        this.acc_name = acc_name;
        this.balance = balance;
    }
    void deposit(float amount){
        this.balance += amount;
    }

    void withdraw(float amount){
        this.balance -= amount;
    }

    void displayBalance(){
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args){
        CaseStudy_2 obj = new CaseStudy_2(23434, "abc", 6447.0f);
        obj.deposit(500.0f);
        obj.withdraw(147.0f);
        obj.displayBalance();
    }
}