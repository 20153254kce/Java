package ch06.test3;

public class Cart {
	private Product[] products;
	private int productCount;
	
	public Cart() {
		
		this.products = new Product[10];
		this.productCount = 0;
	}
	
	public void addProduct(Product product) {
		if (productCount < 10) {
			products[productCount] = product;
			System.out.println(products[productCount].getName() + " 상품이 장바구니에 담겼습니다.");
			productCount++;
		} else {
			System.out.println("장바구니가 가득 찼습니다.");
		}
	}
	
	public void printCartDetails() {
		
		int sumPrice = 0;
		
		for (int i=0; i< productCount; i++) {
			System.out.println("상품 이름 "+ products[i].getName());
			System.out.println("상품 가격 " + products[i].getPrice());
			sumPrice += products[i].getPrice();
		}
		
		System.out.println("====================");
	    System.out.println("총 합계 금액 : " + sumPrice);
		
	}
}
