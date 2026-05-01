package sub4;

public class WhileTest {
	
	public static void main(String[] args) {
		
		//while 기본
		int i = 0; //반복변수
		
		while(i < 10) {
			System.out.println("i : " + i);
			i++;
		}
		
		//1부터 10까지 합
		int sum = 0, k = 1;
		
		while(k<=10) {
			sum += k;
			k++;
		}
		
		System.out.println(sum);
		
		//do-while : 최초 한번은 무조건 반복을 수행하는 while문
		int total = 0, j = 1;
		
		do {
			if (j%2==0 ) {
				total += j;
			}
			j++;
		}while(j<=10);
		
		System.out.println(total);
		
		// break
		int num = 1;
		
		while(true) {
			if(num%5==0 && num%7==0) {
				break;
			}
			num++;
		}
		
		System.out.println(num);
		
		//continue
		
		int tot = 0, n = 1;
		
		while (n<=10) {
			n++;
			if(n%2==1) {
				continue;
			}
			tot += n;
		}
		
		System.out.println(tot);
	}
}
