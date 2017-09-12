package lesson2.blinov_ch2_vA_5;

import java.util.ArrayList;
 /*ищем:
 a)  список книг заданного автора;
 b)  список книг, выпущенных заданным издательством;
 c)  список книг, выпущенных после заданного года.*/


public class Books {
    private final ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> findBookByAuthor(String author) {
        ArrayList<Book> selectedAuthors = new ArrayList<>();
        for (Book i : books) {
            if (i.getAuthors().equals(author)) {
                selectedAuthors.add(i);
            }
        }
        return selectedAuthors;
    }

    public ArrayList<Book> findBookByPublishingHouse(String publishingHouse) {
        ArrayList<Book> selectedBooks = new ArrayList<>();
        for (Book i : books) {
            if (i.getPublishingHouse().equals(publishingHouse)) {
                selectedBooks.add(i);
            }
        }
        return selectedBooks;
    }

    public ArrayList<Book> findBookByyearOfPublishing(int yearOfPublishing) {
        ArrayList<Book> selectedBooks = new ArrayList<>();
        for (Book i : books) {
            if (i.getYearOfPublishing() > (yearOfPublishing)) {
                selectedBooks.add(i);
            }
        }
        return selectedBooks;
    }


}
