package test6.sub4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		isBorrowd = false;
	}
	
	public void borrowBook() {
	    if (isBorrowd) {
	        System.out.println(this.title + " 이미 대출됨");
	    } else {
	        isBorrowd = true;
	        System.out.println("도서대출 : " + this.title);
	    }
	}
	
	public void returnBook() {
        if (isBorrowd) {
            isBorrowd = false;
        }
    }
	
	public void getBookInfo() {
		System.out.println("도서명 : " + this.title);
		System.out.println("저자 : " + this.author);
		System.out.println("ISBN : " + this.isbn);
		if(isBorrowd) {
			System.out.println("대출여부 : 불가능");
		} else {
			System.out.println("대출여부 : 가능");
		}
		
	}
	
	public String getTitle() {
		return title;
	}
}
