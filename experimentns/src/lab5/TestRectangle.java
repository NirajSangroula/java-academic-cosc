package lab5;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.printf("Width: %.2f\tHeight: %.2f\t Perimeter: %.2f Area: %.2f\n", r1.getWidth(), r1.getHeight(), r1.getPerimeter(), r1.getArea());
        System.out.printf("Width: %.2f\tHeight: %.2f\t Perimeter: %.2f Area: %.2f\n", r2.getWidth(), r2.getHeight(), r2.getPerimeter(), r2.getArea());
    }
    
}