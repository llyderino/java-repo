package oop;
class person{
	String name;
	String email;
	String phoneNumber;
	
	void walk(){
		
		System.out.println(name + "is walking");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + "is sleeping");
	}
	
	
}
public class Demo {

	public static void main(String[] args) {
		person personScanner = new person ();
		personScanner.name = "jonathan";
		personScanner.email = "jonathan@emial.com";
		personScanner.phoneNumber = "12345";
		
		personScanner.walk();
		personScanner.sleep();
		personScanner.eat();
		
		person personScanner2 = new person ();
		personScanner2.email="asd";
		personScanner2.eat();

	/*
		
//person
		String name = "joe";//attributes,variables,,adjectives,descriptors
		String email = "wat@email.com";
		String phone = "123123";
		System.out.println(name + "walking");
		System.out.println();
		
		String name2 = "walter";//attributes,variables,,adjectives,descriptors
		String email2 = "walter@email.com";
		String phone2 = "123123";

		
		
	}
	static void walking (String name) {
		
		
	System.out.println(name + "walking");	
		*/
		
	}
	
	

}
