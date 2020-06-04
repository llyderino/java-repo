package oop;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanAccount LA = new LoanAccount();
		
		LA.increaseRate();
		LA.setRate();
		LA.setAmmortSchedule();
		LA.setTerm(22);
		
		
		IRate account1 = new LoanAccount();
		account1.setRate();
		account1.increaseRate();
	}

}
