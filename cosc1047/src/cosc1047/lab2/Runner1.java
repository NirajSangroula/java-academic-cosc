package cosc1047.lab2;

public class Runner1 {
    public static void main(String[] args) {
        System.out.println("Geometric objct");
        GeometricObject go = new GeometricObject("Red", true);
        System.out.println(go);
        System.out.println("\nDefault circle"); 
        Circle c1 = new Circle();
        System.out.println(c1.toString());

        c1.printCircle();

        Circle c2 = new Circle(7.1, "Green", true);
        System.out.println("\nSecond circle");
        System.out.println(c2.toString());
        c2.printCircle();

        System.out.println("\nRectangle");
        Rectangle r1 = new Rectangle(4, 2, "Blue", false);
        System.out.println(r1.toString());
        System.out.printf("Width: %.2f, Height: %.2f\nPerimeter: %.2f\nArea: %.2f\n", r1.getWidth(), r1.getHeight(), r1.getPerimeter(), r1.getArea());

    }
}
