package sub3;

public class ForTest {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("i : " + i);
		}
		
		int sum = 0;
		
		for (int i=1; i<=10; i++)
		{
			sum += i;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		int tot = 0;
		
		for (int k=1 ; k <=10; k++)
		{
			if (k%2 == 0)
			{
				tot += k;
			}
		}
		
		System.out.println("1부터 10까지 짝수 합 : " + tot);
		
		//for문 중첩
		
		for (int a = 1; a<=3; a++)
		{
			for (int b = 1; b<=5; b++)
			{
				System.out.println("b : " +  b);
				/*
				for (int c=1; c<=3; c++)
					System.out.println("c : " +  c);
					*/
			}
		}
	
		for (int x=2; x<10; x++)
		{
			System.out.println(x+"단");
			
			for (int y=1; y<10; y++) {
				
				int z = x*y;
				
				System.out.printf("%d x %d = %d\n", x, y, z); //형식 지정자 쓸 거면 printf
			}
		}
		
		//별삼각형
		
		for(int start=10; start > 0; start--)
		{
			for(int end=1; end <= start; end++)
			{
				System.out.print("★");
			}
			System.out.print("\n");
		}
		
		
	}
}
