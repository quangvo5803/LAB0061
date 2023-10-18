package Model;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printResult() {
        System.out.println("---------- Circle ----------");
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f \n" , getArea());
        System.out.printf("Perimeter: %.2f \n" , getPerimeter());
        System.out.println();
    }
}
