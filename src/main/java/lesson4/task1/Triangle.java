package lesson4.task1;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
}
