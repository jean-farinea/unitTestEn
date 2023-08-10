package lesson4.task1;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = side * 4;
        return perimeter;
    }
}
