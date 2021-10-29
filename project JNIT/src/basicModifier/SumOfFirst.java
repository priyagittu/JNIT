package basicModifier;

public class SumOfFirst {

	public static void main(String[] args) {
		int n=12345,sum=0,fn,ln;
		ln=n%10;
		System.out.println(ln);
		while(n>1) {
			fn=n/10;
			System.out.println(fn);
			sum=fn+ln;
			n=n/10;
		}
		System.out.println("sum of first and last number is:"+ sum);
	}

}
