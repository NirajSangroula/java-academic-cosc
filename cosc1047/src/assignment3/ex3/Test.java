package assignment3.ex3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter three sides of triangle:");
            Triangle t = new Triangle(s.nextDouble(), s.nextDouble(), s.nextDouble());
            System.out.println("Enter color: ");
            t.setColor(s.next());
            System.out.println("Enter 1 for filled, other number for not filled: ");
            t.setFilled(s.nextInt() == 1);
            System.out.printf("Area: %f\nPerimeter: %f\nColor: %s\nFilled : %b\n", t.getArea(), t.getPerimeter(), t.getColor(), t.isFilled());
        }
        catch(IllegalTriangleException e){
            System.out.println("Invalid Triangle");
        }
    }
}
