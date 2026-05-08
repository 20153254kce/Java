package ch06.test2;

public class Seat {
	int seatNumber;
	boolean isOccupied;
	
	public Seat(int seatNumber) {
		this.seatNumber = seatNumber;
		this.isOccupied = false;
	}
	
	public void reserve() {
		isOccupied = true;
		System.out.println(this.seatNumber + "번 좌석 예약 완료");
	}
	public void cancel() {
		isOccupied = false;
		System.out.println(this.seatNumber + "번 좌석 반납 완료");
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	
}
