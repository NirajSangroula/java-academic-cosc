package pack;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class InsuredPackage extends Package
{
	private final double[] add = {2.45, 3.95, 5.55};
	private double additionalCost;
	public InsuredPackage(int w, char m)
	{
		super(w, m);
		
		this.calculateShipping();
	}
	
	public void calculateShipping()
	{
		double shippingCost = super.getShippingCost();
		if(shippingCost >= 3.01) {
			additionalCost=5.55;
		} else if(shippingCost >= 1.01) {
			additionalCost = 3.95;
		}else if(shippingCost >= 0) {
			additionalCost = 2.45;
		}		
	}
	
	@Override
	public void display()
	{
		DecimalFormat f = new DecimalFormat("##.00");
		String formattedShippingCost = f.format(getShippingCost());
		String formattedadditionalCost = f.format(additionalCost);
		String formattedCostWithInsurance = f.format(additionalCost + getShippingCost());
		
		String displayString = "";
		displayString += "Weight: " + super.getWeight();
		displayString += "\nShipping Method: " + super.getShippingMethod();
		displayString += "\nShipping Cost before insurance: $" + formattedShippingCost;
		displayString += "\nInsurance Cost: $" + formattedadditionalCost;
		displayString += "\nShipping Cost with insurance: $" + formattedCostWithInsurance;
		
		JOptionPane.showMessageDialog(null, displayString);
	}
}