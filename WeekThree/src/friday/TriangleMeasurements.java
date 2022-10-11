package friday;

public class TriangleMeasurements {

    public static void main(String[] args) {

        Triangle rightAngleTriangle = new Triangle();

        rightAngleTriangle.perimeterOfTriangle(1, 4, 9);
        rightAngleTriangle.areaOfTriangle(1, 4);
    }
}

class Triangle {

    public Triangle() {
        super();
    }

    public int perimeterOfTriangle(int sideA, int sideB, int sideC) {
        int perimeterCal = sideA + sideB + sideC;
        return perimeterCal;
    }

    public int areaOfTriangle(int height, int base) {
        int areaCal = (height * base) / 2;
        return areaCal;
    }
}

/*
[x] Create Triangle Class - no Params in constructor = default constructor
[x] Calculate Perimeter = sum of each side of a triangle = a + b + c
[x] Calculate AREA = Height * Base / 2
*/