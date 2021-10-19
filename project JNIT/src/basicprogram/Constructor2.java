package basicprogram;
class University{
	String clgName;
	String student;
	int pin;
	int no;
	University(){
		String clgName="clgName";
		String student="ranjit";
		int pin=345;
		int no=2222;
		}
	void display() {
		System.out.println("name of clg:" + clgName);
		System.out.println("name of student:" + student);
		System.out.println("pin of clg:" + 345);
		System.out.println("no of clg:" + 2222);
		
	}
}

public class Constructor2 {

	public static void main(String[] args) {
		University cr=new University();
		cr.display();
		University pr=new University();
pr.clgName="ddst";
pr.display();
	}

}
