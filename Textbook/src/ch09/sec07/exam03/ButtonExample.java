package ch09.sec07.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//OK 버튼 생성
		Button btnOk = new Button();
		
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok버튼을 클릭했습니다.");
			}
		});

		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("취소 버튼을 클릭했습니다.");
				
			}                                                                   
		});

		btnCancel.click();
	}

}
