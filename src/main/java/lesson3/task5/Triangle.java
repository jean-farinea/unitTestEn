package lesson3.task5;

public class Triangle {
    float sideA;
    float sideB;
    float sideC;

    public Triangle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean checkRightTriangle() {
        if (((sideA * sideA) + (sideB * sideB)) == sideC * sideC) {
            return true;
        } else {
            return false;
        }
    }

}