package gslc2;

public class main {
	public static void main(String[] args) {
		food food = new food("rice", 5, "1/1/1");
		drink drink = new drink("water", 3, "2/2/2", 2);
		
		food.display();
		drink.display();
	}
}
