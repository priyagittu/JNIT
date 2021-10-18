package basicprogram;
class Company{
	void detail() {
		System.out.println("employee detail");
	}
	void desigation(int empid,int ext,String name) {
	System.out.println("employee designation is:" + empid + "," + name + ","+ ext);
		}
	String work() {
		return "engineering";
		
	}
	int salary(int amount) {
		return 345;
		
	}
}
public class Method2 {

	public static void main(String[] args) {
		Company ranjit=new Company();
		ranjit.detail();
		ranjit.desigation(345,5674,"ram");
		System.out.println("ranjit work is done :"+ranjit.work());
		System.out.println("ranjit salary is :"+ranjit.salary(345));
		
		
		
		

	}

}
