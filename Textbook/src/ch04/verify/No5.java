package ch04.verify;

public class No5 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			int x = 4*i;
			for(int j=1; j<=10; j++) {
				int y = 5*j;
				if(x+y==60) {
					System.out.printf("(%d,%d)", x, y);
					System.out.println();
				}
			}
		}
	}
}
