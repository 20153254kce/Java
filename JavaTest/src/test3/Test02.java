package test3;

class King {
	private String name;
	private int year;
	
	public King(int year) { //name을 받고 있기 때문에 year만 받아옴
		this("정조");
		this.year = year;
	}
	
	public King(String name) {
		this.name = name;
	}
	
	public King(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public void show() {
		System.out.println("----------------");
		System.out.println("name : "+name);
		System.out.println("year : "+year);
	}
}



public class Test02 {
	public static void main(String[] args) {
		
		King k1 = new King("태조", 1392);
		King k2 = new King("세종대왕");
		King k3 = new King(1776);
		
		k1.show();
		k2.show();
		k3.show();
	}
}
