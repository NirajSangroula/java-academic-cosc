package lab5;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(){
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return 2 * (height + width);
    }
}
