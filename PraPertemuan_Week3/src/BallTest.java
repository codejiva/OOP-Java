public class BallTest {
    public static void main(String[] args) {
        Ball myBall = new Ball(10.0f, 20.0f, 15, 2.0f, 3.0f);

        System.out.println("Posisi awal: " + myBall.toString());

        myBall.move();
        System.out.println("Posisi setelah move(): " + myBall.toString());

        myBall.reflectHorizontal();
        System.out.println("Posisi setelah reflectHorizontal(): " + myBall.toString());

        myBall.reflectVertical();
        System.out.println("Posisi setelah reflectVertical(): " + myBall.toString());
    }
}

