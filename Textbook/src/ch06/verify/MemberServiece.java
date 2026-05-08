package ch06.verify;

public class MemberServiece {
	String id;
	String password;
	
	public MemberServiece() {
	}
	
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
