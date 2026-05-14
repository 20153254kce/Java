package ch09.sec06.exam01;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//OK 버튼 생성
		Button btnOk = new Button();
		
		//ok 버튼 클릭 이벤트를 처리할 구현 클래스 (로컬클래스)
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Ok버튼을 클릭했습니다.");
			}
		}
		
		btnOk.setClickListener(new OkListener());
		btnOk.click();
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		}
		
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
	}

}
