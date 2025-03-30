public class Cylinder extends Circle {

    private double height;

    // == Constructor ==
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    // == Getters ==
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    // == Equals and HashCode ==
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Cylinder cylinder = (Cylinder) obj;
        return Double.compare(cylinder.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), height);
    }

    // == ToString Method ==
    @Override
    public String toString() {
        return String.format("Cylinder [Radius: %.2f, Height: %.2f, Volume: %.2f]",
                getRadius(), height, getVolume());
    }

    // == Main Method for Testing ==
    public static void main(String[] args) {
        // Valid inputs
        Circle circle1 = new Circle(5.0);
        Cylinder cylinder1 = new Cylinder(5.0, 10.0);

        System.out.println("Valid Inputs:");
        System.out.println(circle1);
        System.out.println(cylinder1);

        // Invalid inputs
        Circle invalidCircle = new Circle(-3.0);
        Cylinder invalidCylinder = new Cylinder(5.0, -7.0);

        System.out.println("\nInvalid Inputs:");
        System.out.println(invalidCircle);
        System.out.println(invalidCylinder);

        // Equality check
        System.out.println("\nEquality Check:");
        System.out.println("circle1 equals invalidCircle: " + circle1.equals(invalidCircle));
        System.out.println("cylinder1 equals invalidCylinder: " + cylinder1.equals(invalidCylinder));

        // Hash codes
        System.out.println("\nHash Codes:");
        System.out.println("circle1 hashCode: " + circle1.hashCode());
        System.out.println("cylinder1 hashCode: " + cylinder1.hashCode());
    }
}
