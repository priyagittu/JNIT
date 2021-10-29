package basicModifier;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=4568,reverse=0,rem;
		while(number!=0) {
			rem=number%10;
			System.out.println("rem number is:"+ rem);
			reverse=reverse*10+rem;
			System.out.println("reverseinside number is:"+ reverse);
			number = number/10;
			System.out.println(" number is:"+ number);
		}
		System.out.println("reverse number is:"+ reverse);
	}

}
