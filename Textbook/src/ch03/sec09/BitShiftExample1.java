package ch03.sec09;

public class BitShiftExample1 {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int res1 = num1 << 3;
		int res2 = num1 * (int) Math.pow(2, 3);
		System.out.println(res1);
		System.out.println(res2);
		
		int num2 = -8;
		int res3 = num2 >> 3;
		int res4 = num2 / (int) Math.pow(2,3);
		System.out.println(res3);
		System.out.println(res4);
	}
}
