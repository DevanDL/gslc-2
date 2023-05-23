package gslc2;

public class drink extends item{
	private double liters;
	
    public drink(String name, double price, String expirationDate, int liters) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.liters = liters;
    }
    
    public String getName() {
    	return name;
    }
    
    public double getPrice() {
    	return price;
    }
}
