package cosc1047.assignment2.ex2;

public class CheckingAccount extends Account {
	private double overDraftLimit;
	public CheckingAccount() {
		overDraftLimit = -10;
	}

	public CheckingAccount(int id, double balance, double overDraftLimit) {
		super(id, balance);
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public void withdraw(double amount){
		if(balance - amount > overDraftLimit){
			balance -= amount;
		}
		else
			System.out.println("Cannot withdraw. Overdraft limit reached.");
	}

	@Override
	public String toString(){
		return super.toString() + String.format("Checking Account\nOverdraft limit: %.2f\n\n", overDraftLimit);
	}
}
