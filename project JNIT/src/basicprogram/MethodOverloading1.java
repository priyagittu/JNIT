package basicprogram;
class Addition{
	int num1;
	int num2;
	String name;
	
	
	void sum(int num1,int num2) {
		System.out.println("add of tho number:" + (num1+num2));
		
	}
	void sum(String PPYN,int num1) {
		System.out.println("add two number: " + ("name"+num1));
		
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		Addition ro=new Addition();
		ro.sum(20, 20);
		Addition cp=new Addition();
		cp.sum("sanya", 10);
		
	}

}
