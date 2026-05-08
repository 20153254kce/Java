package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		int[][] scores = {
				{80,90,96},
				{76,88}
		};
		
		System.out.println(scores.length + " " +  scores[0].length + " " + scores[1].length);
		System.out.println(scores[0][2]);
		
		int class1Sum = 0;
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		
		double Class1avg = (double)class1Sum /scores[0].length;
		System.out.println(class1Sum + " " + Class1avg);
		
		int class2Sum = 0;
		for(int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		
		double Class2avg = (double)class2Sum /scores[1].length;
		System.out.println(class2Sum + " " + Class2avg);
		
		int totalStudent = 0;
		int totalSum = 0;
		 
		for (int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for (int j=0; j<scores[i].length; j++) {
				totalSum += scores[i][j];
			}
		}
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println(totalAvg);
		
	}
}
