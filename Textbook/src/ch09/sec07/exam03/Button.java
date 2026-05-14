package ch09.sec07.exam03;

public class Button {
	public static interface ClickListener { //중첩 인터페이스 선언
		void onClick();
	}
	
	//필드
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
