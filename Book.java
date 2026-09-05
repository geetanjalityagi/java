class Book {
    int book_id;
    String book_title;
    String author;
    boolean available;

    Book(int book_id, String book_title, String author) {
        this.book_id = book_id;
        this.book_title = book_title;
        this.author = author;
        this.available = true;
    }

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void displayBook() {
        System.out.println("Book ID : " + book_id);
        System.out.println("Book Title : " + book_title);
        System.out.println("Author : " + author);

        if (available) {
            System.out.println("Availability : Available");
        } else {
            System.out.println("Availability : Issued");
        }
    }

    public static void main(String[] args) {

        Book obj = new Book(101, "Java Programming", "James Gosling");

        obj.displayBook();

        System.out.println();
        obj.issueBook();

        System.out.println();
        obj.issueBook();

        System.out.println();
        obj.displayBook();

        System.out.println();
        obj.returnBook();

        System.out.println();
        obj.displayBook();
    }
}
