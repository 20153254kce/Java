package sub2;

public class Movie {
	private String title;
	private String director;
	private double rating;
	private int availableSeats;
	
	public Movie(String title, String director, double rating, int availableSeats) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.availableSeats = availableSeats;
	}
	
	public boolean availableSeats() {
		if(this.availableSeats > 0) {
			this.availableSeats--;
			return true;
		} else {
			return false;
		}
	}
	
	public void cancelReservation() {
		this.availableSeats++;
	}
	
	public void showDetails() {
		System.out.println("영화 제목 : " + this.title);
		System.out.println("감독 이름 : " + this.director);
		System.out.println("영화 평점 : " + this.rating);
		System.out.println("예약 가능한 좌석 수 : " + this.availableSeats);
	}
}
