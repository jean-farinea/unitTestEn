package lesson4.task3;

public class Hexagon implements CalculateAreaAndPerimeter {
    double sideLength;

    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        double area = (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2.0;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 6 * sideLength;
        return perimeter;
    }
}
