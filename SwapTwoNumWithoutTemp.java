package basicJava;

public class SwapTwoNumWithoutTemp {
	public static void main(String[] args) {
	
	int a = 10;
	int b = 20;
	
	System.out.println("Before Swap");
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	
	a = a - b;
	b = a + b;
	a = b - a;
	
	System.out.println("After Swap");
	System.out.println("a = "+a);
	System.out.println("b = "+b);

}

}
