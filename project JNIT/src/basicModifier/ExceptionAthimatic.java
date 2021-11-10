package basicModifier;

public class ExceptionAthimatic {

	public static void main(String[] args) {
		int a=12;
		int b=0;
		//String s=null; 
		
		try {
			int c=a/b;
		System.out.println("division of no is" + c);
		}
		catch(ArithmeticException e) {
			System.out.println("arithematic exception");
		}
		System.out.println("statement1");
		System.out.println("statement1");
		try {
		String s=null;
		System.out.println(s.length());
		
	}
catch(NullPointerException e){
	System.out.println(" null point excetion");
}
		try {
			int d[]=new int[10];
			d[11]=9;
			System.out.println("value of d[11]" +d);
			}
		catch(Exception e) {
			System.out.println("arrayindexoutofboundsexception");
			}
		try {
			
				 String str="beginnersbook";
				 System.out.println(str.length());
				 char c = str.charAt(0);
				 c = str.charAt(14);
				 System.out.println(c);
			      }catch(StringIndexOutOfBoundsException e){
				  System.out.println("StringIndexOutOfBoundsException!!");
			       }
		try{
			 int num=Integer.parseInt ("XYZ") ;
			 System.out.println(num);
		      }catch(NumberFormatException e){
			  System.out.println("Number format exception occurred");
		       }
		finally{
			 System.out.println("This is finally block");
		      }  
		   //   System.out.println("Out of try-catch-finally");  
		     
		
}}
