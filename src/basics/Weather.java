package basics;

public class Weather {
	public static void main (String[] args) {
		
	int temperature;
	String Sun="Sunny";
	temperature= 85;
	if (temperature>80 && Sun=="Sunny") {
		
		System.out.println("It is nice to wear shorts");
		
		
	}
	else if (temperature > 60 && Sun=="Sunny") {
		
		System.out.println("It is a little cooler. wear jeans and long sleeves.");
		
		
	}
		
	else {
		System.out.println("wear a sweater");
		
		
	}
		
	}
}
