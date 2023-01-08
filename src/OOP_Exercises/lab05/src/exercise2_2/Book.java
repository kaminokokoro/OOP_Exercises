package OOP_Exercises.lab05.src.exercise2_2;

import exercise2_1.Author;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.authors = author;
        this.price = price;
    }

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name = " + name + ", " + Arrays.toString(authors)
                + ", price = " + price + ", qty = " + qty + "]";
    }
}
