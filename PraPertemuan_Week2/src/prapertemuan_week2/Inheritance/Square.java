/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Inheritance;

/**
 *
 * @author codejiva
 */
public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side); // sama aja
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // karena sama aja dengan rectangle
    }

    public double getSide() {
        return getWidth(); 
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square [ subclass of " + super.toString() + ", side = " + getSide() + " ]";
    }
}
