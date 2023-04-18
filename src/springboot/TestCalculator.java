package springboot;

public class TestCalculator {

	public static void main(String[] args) {
			
		int a=100;
		int b=50;
		
		Calculator cal = new Calculator();
		
		cal.add(a,b);
		
		cal.substraction(a, b);
		
		cal.multiplication(a, b);
		
		cal.divison(a, b);
		
		cal.square(a);
		
		cal.cube(a);
	}

}
