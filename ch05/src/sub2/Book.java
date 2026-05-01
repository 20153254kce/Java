package sub2;

public class Book {
	
	private String title;
	private String author;
	private int copies;
	
	public Book(String title, String author, int copies) {
		this.title = title;
		this.author = author;
		this.copies = copies;
	}
	
	public boolean borrowbook() {
		if (copies >= 1) {
			copies--;
			return true;
		} else {
			return false;
		}
	}
	
	public void returnBook() {
		copies++;
	}
	
	public void show() {
		System.out.println("작가 : " + this.title);
		System.out.println("저자 : " + this.author);
		System.out.println("복사본 : " + this.copies);
	}
}
