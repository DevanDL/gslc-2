package gslc2;

//this abstract class provide common variable for food and drink class
abstract class item implements cart{
    String name;
	double price;
	String expirationDate;
	
	public void display() {
		System.out.println(name);
		System.out.println(price);
	}
}
