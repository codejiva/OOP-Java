public class MyPointTest {

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint(-1, 2);

        // Testing getXY()
        int[] coordinates = point1.getXY();
        System.out.println("Point 1 coordinates: (" + coordinates[0] + ", " + coordinates[1] + ")");

        // Testing setXY()
        point2.setXY(5, -2);
        System.out.println("Point 2 coordinates after setXY(): " + point2);

        // Testing distance(int x, int y)
        double distanceToPoint1 = point1.distance(0, 0);
        System.out.println("Distance from Point 1 to (0,0): " + distanceToPoint1);

        // Testing distance(MyPoint anotherPoint)
        double distanceBetweenPoints = point1.distance(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distanceBetweenPoints);

        // Testing distance() - distance from this point to (0,0)
        double distanceToOrigin = point2.distance();
        System.out.println("Distance from Point 2 to (0,0): " + distanceToOrigin);
    }
}

