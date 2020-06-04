package oop;

public class BankAcc implements IRate {

	String accNumber;
	static final String routingNumber="123123";
	String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	BankAcc(){
		System.out.println("new acc created");
		
		
		
	}
	BankAcc (String accountType){
		System.out.println("new acc: "+accountType);
	
	}

	BankAcc (String accountType, double deposit){
		System.out.println("new acc: "+accountType);
		System.out.println("initial deposit "+deposit);
		String Msg;
		if (deposit<1000) {
			 Msg = "Error minimum deposit should be $1,000.00.";
			
			System.out.println(Msg);
			
			
		}
		else{
			 Msg ="thanks for ur initial deposit of "+ deposit;
			
		}
		balance = balance +deposit;
		
	}
		//getters and setters
	
		public void setName(String name) {
			this.name= "Mr."+name;
		
		}
		public String getName() {
			
			return name;
			
		}
	
		public String getSsn() {
			return ssn;
		}
	
	
		

		//constructors: unique methods
		//1.used to define/setup/ initialize property of an object
		//2. Implicitly called upon instantiation
	
	
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		
		public void setRate() {
			System.out.println("SETTING RATE");
			
		}
		
		public void increaseRate() {
			System.out.println("INCREASING RATE");
			
		}
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	void withdraw(double amount) {
		balance = balance + amount; 
		showActivity("WITHDRAW");
		
	}
	
	void balance() {
		
		System.out.println("Balance is "+ balance);
		
	}
	
	void getStatus() {
		
		
		
		
	}
	
	private void showActivity(String activity) {
		
		
		
		System.out.println("YOUR RECENT TRANSACTION: "+activity);
		System.out.println("YOUR NEW BALANCE IS: "+ balance);
	}
	@Override
	public String toString() {
		
		return "[" + name +". "+accNumber+". ROUTING NUMBER "+routingNumber+".BALANCE: $"+ balance+ "]";		
	}
}
