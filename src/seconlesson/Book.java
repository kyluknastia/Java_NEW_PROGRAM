package seconlesson;

public class Book {
    private String name;
    private double price;
    private Author author;


    public Book(Author author, String name, double price) {
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

  public void setAuthor(Author author) {
        this.author=author;

    }
    public String toString() {
        return author+" "+"name"+" "+name+" "+"price"+" "+price;
    }




}