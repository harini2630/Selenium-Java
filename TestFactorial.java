package testCode;

public class TestFactorial {
	
	public static void main(String[] args) {
		
		
		int var = 1;
		for (int i = 6; i >= 1; i--) {
			var = var * i;
			
			// 1*6=6
			// 6*5=30
			// 30*4=120
			// 120*3=360
			// 360*2=720
		
		}
		System.out.println("The Factorial number of 6 is: " + var);

	}
		
	

}
