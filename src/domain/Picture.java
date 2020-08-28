package domain;

import annotation.DefaultValue;

public class Picture {

	@DefaultValue
	private int price;
	
	private int t = 800;
	
	public Picture(int price) {
		this.price = price;
	}
	
	public Picture() {
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Picture [price=" + price + "]" + "  " + t;
	}
	
	
}
