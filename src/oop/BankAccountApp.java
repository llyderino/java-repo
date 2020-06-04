package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// create bank account
		
		BankAcc acc1 = new BankAcc();
		
		//acc1.name="John lloyd";
		//with encapsulation
		
		acc1.setName("Roger");
		System.out.println(acc1.getName());
		acc1.accNumber="123123321";
		acc1.balance=10000;
		//polymorphism thru overriding
		System.out.println(acc1.toString());
		acc1.setSsn("321321");
		System.out.println("SSN: "+acc1.getSsn());
		
		
		acc1.deposit(1500);
		acc1.deposit(1500); 
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		//polymorph thru override 
		BankAcc acc2 = new BankAcc("checking acc");
		acc2.accNumber="321312231";
		
		BankAcc acc3 = new BankAcc("deposit acc", 5000);
		acc3.accNumber="421124331";
		acc3.balance();
		//acc1.routingNumber="123213";
		
		//demo for inheritance
		
		CDAccount cd1 = new CDAccount();
		cd1.interestRate="4.5";
		cd1.balance=3000;
		cd1.name= "juan";
		cd1.accountType="CD Account";
		System.out.println(cd1.toString());
		cd1.toString();
		
	}

}
