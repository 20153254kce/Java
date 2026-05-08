package ch06.sec08.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int res1 = myCom.sum(1,2,3);
		int res2 = myCom.sum(1,2,4,5,6);
		System.out.println(res1 + ", " + res2);
		
		int[] values = {1,2,3,4,5};
		int res3 = myCom.sum(values); //배열 입력 가능
		System.out.println(res3);
		
		int res4 = myCom.sum(new int[] {1,2,3,4,5,6}); //배열 객체 생성 가능
		System.out.println(res4);
		
	}
}
