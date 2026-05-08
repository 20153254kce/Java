package ch03.sec06;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean res1 = (num1 == num2);
		boolean res2 = (num1 != num2);
		boolean res3 = (num1 <= num2);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		char ch1 = 'A';
		char ch2 = 'B';
		boolean res4 = (ch1 < ch2);
		System.out.println(res4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean res5 = (num3 == num4);
		System.out.println(res5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean res6 = (num5 == num6);
		boolean res7 = (num5 == (float)num6);
		System.out.println(res6);
		System.out.println(res7);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean res8 = (str1.equals(str2));
		boolean res9 = (! str1.equals(str2));
		System.out.println(res8);
		System.out.println(res9);
	}
}
