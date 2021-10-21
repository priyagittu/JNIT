package basicprogram;
class University3{
	static class Department3{
		void announcement() {
			System.out.println("corerection will start in 10 days");
		}
		 static void result() {
			System.out.println("result will be out at the end of this month");
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
	University3.Department3 eee=new University3.Department3();
	eee.announcement();
	University3.Department3.result();
	}

}
