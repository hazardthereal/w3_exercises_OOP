public class Circle {
    private double radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double area = (radius * radius) * Math.PI;
        return area;
    }
    public double getCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

}
