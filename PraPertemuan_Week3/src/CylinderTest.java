public class CylinderTest {

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(3.0, "Blue", 5.0);

        System.out.println("Cylinder 1:");
        System.out.println("Base: " + cylinder1.toString());
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Volume: " + cylinder1.getVolume());
    }
}

