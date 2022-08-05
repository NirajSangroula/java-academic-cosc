package cosc1047.lab2;

import java.util.Date;

public class GeometricObject {
    private String color;
	private boolean filled;
    private Date dateCreated;

	public GeometricObject(){
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        this();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

    public Date getDateCreated() {
		return dateCreated;
	}

    @Override
    public String toString(){
        return String.format("Created on %s, with color %s and %s.",dateCreated, color, filled?"filled": "not filled" );
    }
}
