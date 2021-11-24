interface MyInterface1 {

    // abstract method
    String reverse(String n);
}
/*class Demo implements MyInterface1{
	public String reverse(String str) {
		 String result = "";
         for (int i = str.length()-1; i >= 0 ; i--)
         result += str.charAt(i);
         return result;
			
		}
}*/

public class LamdaExpWithParameter {
    public static void main( String[] args ) {
    	//MyInterface1 ref=new Demo();
    	
    	

        // declare a reference to MyInterface
        // assign a lambda expression to the reference
        MyInterface1 ref = (str) -> {

            String result = "abc";
            for (int i = str.length()-1; i >= 0 ; i--)
            result += str.charAt(i);
            return result;
        };

        // call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("welcome"));
    }

}






