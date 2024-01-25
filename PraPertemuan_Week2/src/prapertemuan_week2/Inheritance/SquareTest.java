/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Inheritance;

/**
 *
 * @author codejiva
 */
public class SquareTest {

    public static void main(String[] args) {

        Square square1 = new Square();
        Square square2 = new Square(4.0);
        Square square3 = new Square(3.0, "Yellow", true);

        // Sebelum perubahan
        System.out.println("Square 1:");
        System.out.println(square1.toString());
        System.out.println();

        System.out.println("Square 2:");
        System.out.println(square2.toString());
        System.out.println();

        System.out.println("Square 3:");
        System.out.println(square3.toString());
        System.out.println();

        // Mengubah square1
        square1.setColor("Pink");
        square1.setSide(2.5);

        // Menampilkan hasil perubahan
        System.out.println("After modification Square 1:");
        System.out.println(square1.toString());
        System.out.println();

        System.out.println("Area of Square 3: " + square3.getArea());
        System.out.println("Perimeter of Square 3: " + square3.getPerimeter());
    }
}
