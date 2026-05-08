package ch04.sec04;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		for(int n=2; n<=9; n++) {
			System.out.println(n + "단");
			for(int m=2; m<=9; m++)
			{
				System.out.println(n + "*" + m + "=" + n*m);
			}
		}
	}
}
