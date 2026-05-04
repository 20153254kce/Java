package sub4;

public class Engineer extends Person {

	private String field;
	
	public Engineer(String name, int age, String field) {
		super(name, age);
		this.field = field;
	}
	
	public void work() {
		super.work();
		super.introduce();
		System.out.println("제 분야는 [" + this.field + "]입니다.");
	}
}
