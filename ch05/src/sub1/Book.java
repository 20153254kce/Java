package sub1;

public class Book {
	
	String title;
	String author;
	int copies;
	
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
