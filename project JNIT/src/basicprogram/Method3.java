package basicprogram;
class Patient{
	public void sick() {
		System.out.println("patient is sick");
		
	}
public void CheckUp(String form) {
	System.out.println("form is generated");
}
String treatment(String report1,int no,String report2) {
	return "disease";
}
String check() {
	return "amount";
}
}
public class Method3 {

	public static void main(String[] args) {
		Patient suresh=new Patient();
		suresh.sick();
		suresh.CheckUp("Abc");
		System.out.println("disease caught:"+ "lungs infection" +","+ 10 + "," +"brain problem");
		System.out.println("bill is paid:");
		
		
				

	}

}
