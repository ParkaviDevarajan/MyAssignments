package week3.day2;

public class AxisBank extends BankInfo{
	
	public void deposite() 
	{
		System.out.println("Deposite for axis class override");
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposite();

	}

}
