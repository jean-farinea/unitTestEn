package lesson4.task1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
