/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Composition;

/**
 *
 * @author codejiva
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0; // qty tuh quantity
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
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
    
    public int Qty() {
        return qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();

        for (int i = 0; i < authors.length; i++) {
            authorNames.append(authors[i].getName());
            if (i < authors.length - 1) {
                authorNames.append(", ");
            }
        }

        return authorNames.toString();
    }

    @Override
    public String toString() {
        return "Book [ name = " + name + ", authors = { " + getAuthorDetails() + " }, price = " + price + ", qty = " + qty + " ]";
    }

    private String getAuthorDetails() {
        StringBuilder authorDetails = new StringBuilder();

        for (int i = 0; i < authors.length; i++) {
            authorDetails.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorDetails.append(",");
            }
        }

        return authorDetails.toString();
    }
}
