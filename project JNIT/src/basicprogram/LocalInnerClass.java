package basicprogram;
class University2{
	void announcement() {
		System.out.println("exam date is decided");
	
	class Department2{
		void prepareQuestion() {
			System.out.println("question needs to prepare before exam date");
		}
	}
		Department2 etce=new Department2();
	     etce.prepareQuestion();
	
}}
public class LocalInnerClass {

	public static void main(String[] args) {
		University2 mit=new University2();
		mit.announcement();
		}
	}
