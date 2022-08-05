package cosc1047.assignment1;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this(0, 0);
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(MyPoint p){
        return distance(p.getX(), p.getY());
    }

    public double distance(double x, double y){
        double differenceInX = this.x - x;
        double differenceInY = this.y - y;
        return Math.sqrt(Math.pow(differenceInX, 2) + Math.pow(differenceInY, 2));

    }

    public static double distance(MyPoint p1, MyPoint p2){
        return p1.distance(p2);
    }
}
