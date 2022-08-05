package cosc1047.lab2;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public void printCircle(){
        System.out.println("Radius : " + radius);
        System.out.printf("Diameter: %.2f\n", getDiameter());
        System.out.printf("Area: %.2f\n", getArea());
        System.out.printf("Perimeter: %.2f\n", getPerimeter());
    }
}