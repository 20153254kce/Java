package ch06.test2;


public class Student {
	private String name;
	private Seat mySeat;
	
	
	public  Student(String name) {
			this.name = name;
			this.mySeat = null;
			}
	
	public void takeSeat(Seat seat) {
		if (seat.isOccupied) {
			System.out.println("이미 사용 중인 좌석입니다."); 
		} else {
			seat.reserve();
			this.mySeat = seat;
		}
	}
	
	public void leaveSeat() {
		if(mySeat != null) {
			mySeat.cancel();
			this.mySeat = null;
		}
	}
	
	public void printStudentStatus() {
		if(mySeat != null) {
			System.out.println("이름 : " + this.name + ", 예약 좌석 : [" + mySeat.getSeatNumber() + "]");
		} else {
			System.out.println("이름 : " + this.name + ", 예약 좌석 : [없음] ");
		}
		
	}

}
