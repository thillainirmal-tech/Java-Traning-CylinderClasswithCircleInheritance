public class Circle {

    private double radius;

    // == Constructor ==
    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    // == Getters ==
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    // == Equals and HashCode ==
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(radius);
    }

    // == ToString Method ==
    @Override
    public String toString() {
        return String.format("Circle [Radius: %.2f, Area: %.2f]", radius, getArea());
    }
}
