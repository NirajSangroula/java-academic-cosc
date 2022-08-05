package application;

public class Investment {
	private double amount;
	private double monthlyInterestRate;
	private double years;
	public Investment() {
		this(1000, 1, 1);
	}
	
	public Investment(double amount, double monthlyInterestRate, double years) {
		this.amount = amount;
		this.monthlyInterestRate = monthlyInterestRate;
		this.years = years;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getYears() {
		return years;
	}

	public void setYears(double years) {
		this.years = years;
	}
	
	public double getFutureInvestmentValue() {
		return amount * Math.pow((1 + monthlyInterestRate), years * 12);
	}
}
