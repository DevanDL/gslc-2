package gslc2;


public class food extends item{
	
    public food(String name, double price, String expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }
    
    public String getName() {
    	return name;
    }
    
    public double getPrice() {
    	return price;
    }
}
