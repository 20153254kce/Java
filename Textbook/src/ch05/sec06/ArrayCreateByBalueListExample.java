package ch05.sec06;

public class ArrayCreateByBalueListExample {
	public static void main(String[] args) {
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		for (int i=0; i<season.length; i++)
		{
			System.out.println(season[i]);
		}
		
		season[1] = "여름";
		System.out.println(season[1]);
		
		int[] scores = {93, 80, 100};
		int sum = 0;
		for (int i=0; i<3; i++)
		{
			sum += scores[i];
		}
		
		System.out.println(sum);
		double avg = (double) sum/3;
		System.out.println(avg);
	}
}
