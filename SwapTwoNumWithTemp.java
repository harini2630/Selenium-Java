package basicJava;

public class SwapTwoNumWithTemp {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Before Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//value of a assigned to temp
		temp = a;
		//value of b assigned to a
		a = b;
		//value of temp assigned to b
		b = temp;
		
		System.out.println("After Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

}
