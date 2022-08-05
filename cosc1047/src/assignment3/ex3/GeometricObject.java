package assignment3.ex3;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean isFilled;
    private Date dateCreated;
    public GeometricObject(){

    }
    public GeometricObject(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
        dateCreated = new Date();
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return isFilled;
    }
    public void setFilled(boolean isFilled){
        this.isFilled = isFilled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
