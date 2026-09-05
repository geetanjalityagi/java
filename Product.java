class Product {
    int product_id;
    String product_name;
    float price;
    int quantity;

    Product(int product_id, String product_name, float price, int quantity) {
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

        Product p1 = new Product(101, "Laptop", 45000.0f, 1);
        Product p2 = new Product(102, "Mouse", 500.0f, 2);
        Product p3 = new Product(103, "Keyboard", 1000.0f, 1);

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
