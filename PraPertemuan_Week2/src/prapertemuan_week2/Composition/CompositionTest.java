/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Composition;

/**
 *
 * @author codejiva
 */
public class CompositionTest {

    public static void main(String[] args) {
        
        Author author1 = new Author("Pramoedya Ananta Toer", "minke@stis.ac.id", 'M');
        Author author2 = new Author("R. F. Kuang", "fang_runin@gmail.com", 'F');
        Author author3 = new Author("Eka Kurniawan", "rajadangdut@gmail.com", 'M');
        
        
        Author[] authors = {author1, author2, author3};

        
        Book book1 = new Book("Buku Terlarang", authors, 10000);
        Book book2 = new Book("Buku Rahasia Hidup Abadi", authors, 75000, 50);
        Book book3 = new Book("5 menit jago Java", authors, 135000, 15);

        
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        
        System.out.println("Author names for Book1: " + book1.getAuthorNames());
        System.out.println("Author names for Book2: " + book2.getAuthorNames());
        System.out.println("Author names for Book3: " + book2.getAuthorNames());
        
        // Skenario 1: Buku dibuat oleh seluruh authors
        Author[] authorsBook1 = {author1, author2, author3};
        System.out.println("Skenario 1:");
        Book skenario1 = new Book("Petualangan Mencari Jawaban jilid I", authorsBook1, 50000, 50);
        System.out.println(skenario1.toString());
        System.out.println();

        // Skenario 2: Buku ditulis hanya 2 authors
        Author[] authorsBook2 = {author1, author2};
        System.out.println("Skenario 2:");
        Book skenario2 = new Book("Petualangan Mencari Jawaban jilid II", authorsBook2, 50000, 50);
        System.out.println(skenario2.toString());
        System.out.println();

        // Skenario 3: Buku ditulis oleh salah satu authors
        Author[] authorsBook3 = {author3};
        System.out.println("Skenario 3:");
        Book skenario3 = new Book("Petualangan Mencari Jawaban jilid III", authorsBook3, 50000, 50);
        System.out.println(skenario3.toString());
    }
}

