package pack;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Package
{
	private int weight;
	private char shippingMethod;
	private double shippingCost;
	private final char defaultShipping = 'M';
	
	private final double[] COST_AIR = {2.00, 3.00, 4.50};
	private final double[] COST_TRUCK = {1.50, 2.35, 3.25};
	private final double[] COST_MAIL = {0.50, 1.50, 2.15};
	
	
	public Package(int w, char m)
	{
		setWeight(w);
		setShippingMethod(m); 
		
		calculateCost();
	}
	
	public void setWeight(int w)
	{
		weight = w;
	}
	public int getWeight()
	{
		return weight;
	}
	
	public void setShippingMethod(char m)
	{
		char convertedChar;
		String tempString;
		
		tempString = String.valueOf(m);
		tempString = tempString.toUpperCase();
		convertedChar = tempString.charAt(0);
			
		switch(convertedChar)
		{
			case 'A':
			case 'T':
			case 'M':
				shippingMethod = convertedChar;
				break;
			default:
				System.out.println("Invalid value: " + convertedChar);
				System.out.println("Defaulting to " + defaultShipping);
				shippingMethod = defaultShipping;
				break;
		}
	}
	public char getShippingMethod()
	{
		return shippingMethod;
	}
	
	public void calculateCost()
	{
		switch(getShippingMethod())
		{
			case 'A':
				if(getWeight() <= 8)
					shippingCost = COST_AIR[0];
				else if (getWeight() >= 9 && getWeight() <= 16)
					shippingCost = COST_AIR[1];
				else if (getWeight() >= 17)
					shippingCost = COST_AIR[2];
				break;
			case 'T':
				if(getWeight() <= 8)
					shippingCost = COST_TRUCK[0];
				else if (getWeight() >= 9 && getWeight() <= 16)
					shippingCost = COST_TRUCK[1];
				else if (getWeight() >= 17)
					shippingCost = COST_TRUCK[2];
				break;
			case 'M':
				if(getWeight() <= 8)
					shippingCost = COST_MAIL[0];
				else if (getWeight() >= 9 && getWeight() <= 16)
					shippingCost = COST_MAIL[1];
				else if (getWeight() >= 17)
					shippingCost = COST_MAIL[2];
				break;
		}
	}
	public double getShippingCost()
	{
		return shippingCost;
	}
	
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	
	public void display()
	{
		DecimalFormat f = new DecimalFormat("##.00");
		String formattedShippingCost = f.format(getShippingCost());
		
		String displayString = "";
		displayString += "Weight: " + getWeight();
		displayString += "\nShipping Method: " + getShippingMethod();
		displayString += "\nShipping Cost: $" + formattedShippingCost;
		
		JOptionPane.showMessageDialog(null, displayString);
	}
}