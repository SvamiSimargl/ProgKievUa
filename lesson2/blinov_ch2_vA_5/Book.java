package lesson2.blinov_ch2_vA_5;

public class Book {
    private String name;
    private String authors;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private double price;
    private String typeOfBinding;

    public Book(String name, String authors, String publishingHouse, int yearOfPublishing, int numberOfPages, double price, String typeOfBinding) {
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", authors = " + authors +
                ", publishingHouse = " + publishingHouse +
                ", numberOfPages = " + numberOfPages +
                ", price = " + price +
                ", typeOfBinding = " + typeOfBinding + "."
                + "\n";
    }
}
