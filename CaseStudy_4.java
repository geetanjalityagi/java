class CaseStudy_4{
    int product_id;
    String product_name;
    float price;
    int quantity;

    CaseStudy_4(int product_id, String product_name, float price, int quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
    }

    float totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product ID : " + product_id);
        System.out.println("Product Name : " + product_name);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Cost : " + totalCost());
        System.out.println();
    }

    public static void main(String[] args) {

        CaseStudy_4 p1 = new CaseStudy_4(101, "Laptop", 45000.0f, 1);
        CaseStudy_4 p2 = new CaseStudy_4(102, "Mouse", 500.0f, 2);
        CaseStudy_4 p3 = new CaseStudy_4(103, "Keyboard", 1000.0f, 1);

        p1.display();
        p2.display();
        p3.display();

        float totalBill = p1.totalCost() + p2.totalCost() + p3.totalCost();

        System.out.println("Total Bill : " + totalBill);

        if (totalBill > 5000) {
            float discount = totalBill * 0.10f;
            float finalBill = totalBill - discount;

            System.out.println("Discount : " + discount);
            System.out.println("Final Bill : " + finalBill);
        } else {
            System.out.println("No Discount");
            System.out.println("Final Bill : " + totalBill);
        }
    }
}
