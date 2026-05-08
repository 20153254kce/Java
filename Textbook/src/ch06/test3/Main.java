package ch06.test3;

public class Main {
    public static void main(String[] args) {
        // 1. 상품 객체 생성
        Product p1 = new Product("노트북", 1500000);
        Product p2 = new Product("마우스", 50000);
        Product p3 = new Product("키보드", 120000);

        // 2. 장바구니 생성
        Cart myCart = new Cart();

        // 3. 상품 담기
        myCart.addProduct(p1);
        myCart.addProduct(p2);
        myCart.addProduct(p3);

        // 4. 장바구니 내역 출력 (합계 포함)
        myCart.printCartDetails();
    }
}