package basicModifier;

public class WhileNumberBreak {
public static void main(String[] args) {
		int n=123,sum=0,rem;
		while(n>0) {
			rem=n%10;
			System.out.println(rem);
			sum=rem+sum;
			n=n/10;
			System.out.println(n);
			
		}
		
		System.out.println("sum of  n is:" +sum );
	}

}