package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		
	}

	public void setTerm(int term) {
		
		System.out.println("Setting term to: "+term+ " years.");
		
	}
	public void setAmmortSchedule() {
		
		System.out.println("Ammortization schedule");
		
	}
}
