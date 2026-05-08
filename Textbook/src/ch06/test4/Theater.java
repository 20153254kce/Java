package ch06.test4;

public class Theater {
	private Seat[] seats;
	private String theaterName;
	
	public Theater(String theaterName, int count) {
		this.theaterName = theaterName;
		this.seats = new Seat[count];
	}
	
	public void addSeat(Seat seat, int index) {
		seats[index] = seat;
	}
	
	public void bookSeat(int seatNo) {
	    // 1. 배열 전체를 돌며 번호가 같은 좌석을 찾습니다.
	    for (Seat seat : seats) {
	        if (seat != null && seat.getSeatNo() == seatNo) {
	            // 2. 찾았다면 예약 여부를 확인합니다.
	            if (seat.isReserved()) {
	                System.out.println("이미 예약된 좌석입니다.");
	            } else {
	                seat.reserve();
	                System.out.println(seatNo + "번 좌석 예약 성공");
	            }
	            return; // 찾아서 예약(또는 확인)했으니 메서드 종료!
	        }
	    }
	    // 3. 반복문을 다 돌았는데 여기까지 왔다면? 번호가 틀린 겁니다.
	    System.out.println("해당 번호의 좌석이 존재하지 않습니다.");
	}
	
	public int getTotalSales() {
		int sum = 0;
		for (Seat seat : seats) { //seats 배열에서 Seat 객체를 하나씩 'seat'이라는 이름으로 꺼냄
			if (seat != null && seat.isReserved()) {
				sum += seat.getPrice();
			}
		}
		return sum;
	}
}
