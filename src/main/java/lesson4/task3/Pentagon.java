package lesson4.task3;

public class Pentagon implements CalculateAreaAndPerimeter {
    double sideLength;

    public Pentagon(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        double area = (5.0 / 4.0) * Math.pow(sideLength, 2) * (1.0 / Math.tan(Math.PI / 5.0));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 5.0 * sideLength;
        return perimeter;
    }
}
