package BankInfo;

public class AxisBank extends BankDetails {

	public void deposit() {
		System.out.println("Amount 100000 deposited");
		

	}
	public static void main(String[] args) {
		AxisBank mybank = new AxisBank();
		mybank.deposit();
	}
}
