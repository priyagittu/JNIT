package basicModifier;

public class WhileFactorial {

	public static void main(String[] args) {
	int n=5,fact=1;
	while(n>=1) {
		
		fact=fact*n;
		n--;
		}
	System.out.println("factorial of 5 is:" + fact);
	}
}
