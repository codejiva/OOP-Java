/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Inheritance;

/**
 *
 * @author codejiva
 */
public class RectangleTest {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4.0, 5.0);
        Rectangle rectangle3 = new Rectangle(3.0, 7.0, "Yellow", true);

        // sebelum perubahan
        System.out.println("Rectangle 1:");
        System.out.println(rectangle1.toString());
        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println(rectangle2.toString());
        System.out.println();

        System.out.println("Rectangle 3:");
        System.out.println(rectangle3.toString());
        System.out.println();

        // kita coba ubah rectangle1
        rectangle1.setColor("Pink");
        rectangle1.setWidth(2.5);
        rectangle1.setLength(3.5);

        // tampilkan hasilnya
        System.out.println("After modification Rectangle 1:");
        System.out.println(rectangle1.toString());
        System.out.println();

        
        System.out.println("Area of Rectangle 3: " + rectangle3.getArea());
        System.out.println("Perimeter of Rectangle 3: " + rectangle3.getPerimeter());
    }
}


