/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Inheritance;

/**
 *
 * @author codejiva
 */
public class ShapeTest {
   
    public static void main(String[] args) {
        
        Shape shape1 = new Shape("Blue", false);
        System.out.println("before => " + shape1.toString());
        System.out.println("shape color: " + shape1.getColor());
        shape1.setColor("Brown");
        System.out.println("shape color after setColor(): " + shape1.getColor());
        System.out.println("is shape filled? " + shape1.isFilled());
        shape1.setFilled(true);
        System.out.println("is shape filled after setFilled()?" + shape1.isFilled());
        System.out.println("after => " + shape1.toString());
        
    }
    
}
