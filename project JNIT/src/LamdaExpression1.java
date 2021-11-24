import java.lang.FunctionalInterface;
interface MyInterface{ //this is a functional interface where one interface class having one method
double getPiValue();  //interface method
}
public class LamdaExpression1 {
public static void main( String[] args ) {
MyInterface ref;   // declare a object of MyInterface class
//we cannot initiate the ref i.e my interface ref=new myinterface();
    ref = () -> 3.1415;  //lamda expression
    System.out.println("Value of Pi = " + ref.getPiValue());
    } 
}


	
		

	


