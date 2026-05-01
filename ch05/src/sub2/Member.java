package sub2;

public class Member {
	
	private String name;
	private int age;
	private boolean isActive;
	
	public Member(String name, int age, boolean isActive) {
		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}
	
	public void activate() {
		isActive = true;
	}
	
	public void deactivate() {
		isActive = false;
	}
	
	public boolean isAudlt() {
		if(age >= 20) {
			return true;
		} else {
			return false;
		}
	}
	
	public void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
}
