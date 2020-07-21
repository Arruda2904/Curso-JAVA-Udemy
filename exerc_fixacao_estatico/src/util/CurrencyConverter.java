package util;

public class CurrencyConverter {

	public double price;
	public double quantity;
	
	public double converter() {
		double charge = price*quantity*1.06;
		return charge;
	}

}
