package ch06.sec08.exam04;

public class CalculatorExampel {
	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		double result = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		System.out.println(result + " " + result2);
	}
}
