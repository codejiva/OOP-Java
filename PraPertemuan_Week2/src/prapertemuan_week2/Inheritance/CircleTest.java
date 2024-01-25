/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Inheritance;

/**
 *
 * @author codejiva
 */
public class CircleTest {
    
    public static void main(String[] args) {
        
        Circle circle_test = new Circle();
        Circle circle1 = new Circle(2, "green", true);
        
        System.out.println(circle_test.toString()); // buat liat bedanya super() tanpa parameter
        
        System.out.println("radius circle 1 = " + circle1.getRadius());
        circle1.setRadius(3);
        System.out.println("new radius circle 1 = " + circle1.getRadius());
        System.out.println("circle 1 area = " + circle1.getArea());
        System.out.println("Circle 1 perimeter = " + circle1.getPerimeter());
        System.out.println(circle1.toString());
        System.out.println(circle1.toString2());
        
    }
    
}
