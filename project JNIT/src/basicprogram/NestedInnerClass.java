package basicprogram;
class University1{
	void announcement() {
		System.out.println("exam will start from next month");
		Department cse=new Department();
		cse.prepare();
	}
	class Department{
		void prepare() {
			System.out.println("question paper needs to prepare");
			
		}
	}
}
public class NestedInnerClass {

	public static void main(String[] args) {
	University1 taxes=new University1();
	taxes.announcement();
	

	}

}
