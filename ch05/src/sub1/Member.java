package sub1;

public class Member {
	
	String name;
	int age;
	boolean isActive;
	
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
