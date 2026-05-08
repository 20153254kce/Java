package ch06.test4;

public class Seat {
	private int seatNo;
	private int price;
	private boolean isReserved;
	
	public Seat(int seatNo, int price) {
		this.seatNo = seatNo;
		this.price = price;
		this.isReserved = false;
	}
	
	public void reserve() {
		isReserved = true;
	}
	
	public int getSeatNo() {
		return seatNo;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean isReserved() {
		return isReserved;
	}

}
