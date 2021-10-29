package basicModifier;

public class SumOfSecond {

	public static void main(String[] args) {
		int n=456373,last_digit,secondlast_digit,sum=0,fsn;
		last_digit=n%100;
	secondlast_digit=last_digit/10; //7-quotirnt
	while(n>9) {
			fsn=n%10;
			System.out.println(fsn);
		sum=fsn+secondlast_digit;
		
		n=n/10;
		}
		
System.out.println("sum of second digit and last second digit number is:" +sum);
	}

}
