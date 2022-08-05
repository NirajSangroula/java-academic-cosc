package cosc1047.lab1;

public class LoanTest {

	public static void main(String[] args) {
		Loan loan1 = new Loan();
		System.out.printf("For $%.2f at %.2f%% annual interest rate for %d years\n", loan1.getLoanAmount(), loan1.getAnnualInterestRate(), loan1.getNumberOfYears());
		System.out.printf("Monthly Payment: %.2f\nTotal Payment: %.2f\n\n", loan1.getMonthlyPayment(), loan1.getTotalPayment());
		Loan loan2 = new Loan(15, 2, 15000);
		System.out.printf("For $%.2f at %.2f%% annual interest rate for %d years\n", loan2.getLoanAmount(), loan2.getAnnualInterestRate(), loan2.getNumberOfYears());
		System.out.printf("Monthly Payment: %.2f\nTotal Payment: %.2f\n\n", loan2.getMonthlyPayment(), loan2.getTotalPayment());
	}

}
