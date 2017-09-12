package lesson2.blinov_ch2_vA_5;

public class BooksRunner {
    public static void main(String[] args) {
        Books books = new Books();
        books.addBook(new Book("The Lord Of The Ring", "J.R.R.Tolkien", "Bookingem", 1954, 656, 235.67, "hard"));
        books.addBook(new Book("Silmarillion", "J.R.R.Tolkien", "Bookingem", 1977, 465, 435.11, "hard"));
        books.addBook(new Book("Hobbit", "J.R.R.Tolkien", "Bookingem", 1937, 576, 135.89, "soft"));
        books.addBook(new Book("Shining", "S.King", "L.A.Publish", 1977, 356, 345.23, "hard"));

        System.out.println(books.findBookByAuthor("J.R.R.Tolkien"));
        System.out.println(books.findBookByPublishingHouse("L.A.Publish"));
        System.out.println(books.findBookByyearOfPublishing(1960));


    }
}
