package cosc1047.tests;

public class Triangle {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
		side1 = 0;
		side2 = 0;
		side3 = 0;
	}

	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2)
			throw new IllegalTriangleException();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getSide1() {
		return this.side1;
	}

	public double getSide2() {
		return this.side2;
	}

	public double getSide3() {
		return this.side3;
	}

	public double getPerimeter() {
		return (side1 + side2 + side3);
	}

	public String toString() {
		System.out.println(super.toString());
		return ("Perimeter of the Triangle" + this.getPerimeter());
	}

}
