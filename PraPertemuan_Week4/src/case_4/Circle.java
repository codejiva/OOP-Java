package case_4;

public class Circle implements GeometricObject {
    protected double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
