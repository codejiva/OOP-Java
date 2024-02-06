package case_3;

public class MovableRectangleTest {

    public static void main(String[] args) {
        Movable rect = new MovableRectangle(1, 1, 6, 6, 3, 2);
        System.out.println("Position: " + rect);

        rect.moveDown();
        rect.moveDown();
        rect.moveLeft();

        System.out.println("New position: " + rect);
    }
}
