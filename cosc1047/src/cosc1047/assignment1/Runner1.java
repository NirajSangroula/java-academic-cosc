package cosc1047.assignment1;

public class Runner1 {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		System.out.printf("Distance between (%.2f, %.2f) and (%.2f, %.2f) is %.2f", p1.getX(), p1.getY(), p2.getX(), p2.getY(), MyPoint.distance(p1, p2));
	}

}
