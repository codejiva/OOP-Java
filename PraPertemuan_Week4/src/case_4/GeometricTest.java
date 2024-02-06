package case_4;

public class GeometricTest {

    public static void main(String[] args) {
        GeometricObject circle = new Circle(10);
        System.out.println(circle);
        System.out.println(
                "Keliling: " + String.format("%.02f", circle.getPerimeter())
        );
        System.out.println("Luas: " + String.format("%.02f", circle.getArea()));

        Resizable resizableCirc = new ResizableCircle(20);
        System.out.println("\nSebelum di-resize: \n" + resizableCirc);
        System.out.println(
                "Keliling: " +
                        String.format("%.02f", ((GeometricObject) resizableCirc).getPerimeter())
        );
        System.out.println(
                "Luas: " +
                        String.format("%.02f", ((GeometricObject) resizableCirc).getArea())
        );

        resizableCirc.resize(80);
        System.out.println("\nSetelah di-resize: \n" + resizableCirc);
        System.out.println(
                "Keliling: " +
                        String.format("%.02f", ((GeometricObject) resizableCirc).getPerimeter())
        );
        System.out.println(
                "Luas: " +
                        String.format("%.02f", ((GeometricObject) resizableCirc).getArea())
        );
    }
}

