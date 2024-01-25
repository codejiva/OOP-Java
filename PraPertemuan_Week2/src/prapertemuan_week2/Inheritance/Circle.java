/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Inheritance;
import java.text.DecimalFormat; // untuk format decimal

/**
 *
 * @author codejiva
 */
public class Circle extends Shape {
    
    private double radius;
    private double pi;
        
    public Circle() {
        super(); // sebenernya Java secara otomatis memberi super() tapi biar jelas kita tuliskan saja. 
        radius = 1.0;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        pi = 3.14;
        double area = pi * radius * radius;
        DecimalFormat formatDecimal = new DecimalFormat("#.##"); // buat objek baru
        return Double.parseDouble(formatDecimal.format(area)); // hasilnya akan 2 angka di belakang koma
    }
    
    public double getPerimeter() {
        pi = 3.14;
        return 2*pi*radius;
    }
    
    
    public String toString2() {
        return "Circle [ color = " + getColor() + ", filled = " + isFilled() + ", radius = " + getRadius() + " ]";
    }
    
    @Override
    public String toString() {
        return "Circle[ subclass of " + super.toString() + " radius = " + radius + " ]";
    } // versi sesuai dengan modul
            
}
