public class Circle extends GeometricFigures {


    private double π = 3.14;

    public Circle(double diameter) {
        super(diameter);
    }


    private double countArea() {
        return π * ((getDiameter() / 2) * (getDiameter() / 2));
    }

    private double countPerimeter() {
        return π * getDiameter();
    }

    public String toString() {
        return "Circle perimeter: " + countPerimeter() + "cm.\nArea: " + countArea() + "cm²";
    }

    public void resultOutput() {
        System.out.println("Circle perimeter: " + countPerimeter() + "cm, area: " + countArea() + "cm²");
    }
}
