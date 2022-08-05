package cosc1047.tests;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter("sides.txt")){
        	pw.println(String.valueOf(Math.random() * 20));
        	pw.println(String.valueOf(Math.random() * 20));
        	pw.println(String.valueOf(Math.random() * 20));
        } catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
        
        try(Scanner sc = new Scanner(new File("sides.txt"))){
        	double s1 = sc.nextDouble();
        	double s2 = sc.nextDouble();
        	double s3 = sc.nextDouble();
        	
        	Triangle t = new Triangle(s1, s2, s3);
        	
        } catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IllegalTriangleException e) {
			System.out.println("IllegalTriangleException: The triangle cannot be created.");
			e.printStackTrace();
		}
    }
}
