package cosc1047.assignment2.ex2;

public class SavingAccount extends Account {

	public SavingAccount() {
	}

	public SavingAccount(int id, int balance) {
		super(id, balance);
	}

	@Override
	public void withdraw(double amount){
		if(amount <= balance)
			balance -= amount;
		else
			System.out.println("Insufficient balance");
	}
	@Override
	public String toString(){
		return super.toString() + "Saving Account\n\n";
	}
}
