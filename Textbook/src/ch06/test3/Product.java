package ch06.test3;

public class Product {
	private String pName; //상품명
	private int price; //가격
	
	public Product(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}
	
	public String getName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}
