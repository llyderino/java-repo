package basics;

public class NumbersCalc {
	
	public static void main (String[]args) {
		int a=5;
		int b=10;
		
		
		System.out.println("Start...");
		printName();
		addNumbers(a,b);
		int product = multiplyNumbers(a, b);
		System.out.println(product);
}
	static void addNumbers(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		
	}
static int multiplyNumbers(int numA, int numB) {
	int product = numA*numB;
	addNumbers(product, product);
	return product;
	
	
}
	static void printName() {
System.out.println("Im tyrone");

	
	
	}
}
