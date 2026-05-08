package test6.sub4;

public class Member {
	private String name;
    private String memberId;
    private Book borrowedBook;
    
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBook = null;
    }
    
    public void borrowBook(Book book) {
    	book.borrowBook();
    	this.borrowedBook = book; 
    }
    
    public void returnBook(Book book) {
    	book.returnBook();
    	this.borrowedBook = null;
    	System.out.println("도서반납 : " + book.getTitle());
    }
    
    public void getMemberInfo() {
    	System.out.println("회원명 : " + this.name);
        System.out.println("아이디 : " + this.memberId);
        System.out.print("대출한 도서 : ");
        if (borrowedBook != null) {
            System.out.println(this.borrowedBook .getTitle());
        } else {
            System.out.println("없음");
        }
    }
}
