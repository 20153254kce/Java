package sub1;

/**
 * 날짜 : 2026/04/28
 * 이름 : 강채은
 * 내용 : Java 배열 실습*/
public class ArrayTest {
	
	public static void main(String[] args) {
		
		//배열 생성
		int[] arr1 = {1,2,3,4,5};
		char[] arr2 = {'A', 'B', 'c'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		//배열 원소 출력
		System.out.println(arr1[1]);
		
		//배열길이
		System.out.println(arr1.length); 
		
		//배열 반목분
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for (char c : arr2) { //for-each
			System.out.println(c);
		}
		
		for (String s : arr3) {
			System.out.println(s);
		}
		
		//1차원 배열
		
		int[] scores = {90,60,75,62,90};
		
		int sum = 0;
		
		for (int score : scores) {
			sum += score;
		}
		
		System.out.println(sum);
		
		//2차원 배열
		int[][] arr2d = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}};
		
		System.out.println(arr2d[2][1]);
		
		//3차원 배열
		int[][][] arr3d = {{{1,2,3},{4,5,6},{7,8,9}},
						{{11,12,13},{14,15,16},{17,18,19}},
						{{21,22,23},{24,25,26},{27,28,29}}};
		
		System.out.println(arr3d[2][1][2]);
						
	}
}
