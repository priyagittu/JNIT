package basicprogram;
class Doctor{
	int age;
	int empid;
	String dept;
	String doj;
	static String hosname;
	String name;
}
class Nurses{
	int age;
	int empid;
	String dept;
	String doj;
	String name;
}
public class Hospital {
	public static void main(String[] args) {
		Doctor priya=new Doctor();
		Doctor.hosname="applo";
		priya.age=28;
		priya.empid=001;
		priya.dept="gyno";
		priya.doj="28/03/2020";
		
		Doctor ranjit=new Doctor();
		Doctor.hosname="applo";
		ranjit.age=26;
		ranjit.empid=005;
		ranjit.dept="physo";
		ranjit.doj="28/03/2019";
		
		System.out.println("priya age="+priya.age);
		System.out.println("priya hosname="+priya.hosname);
		System.out.println("priya dept="+priya.dept);
		System.out.println("priya doj="+priya.doj);
		System.out.println("priya empid="+priya.empid);
		
		System.out.println("ranjit age="+ranjit.age);
		System.out.println("ranjit hosname="+ranjit.hosname);
		System.out.println("ranjit dept="+ranjit.dept);
		System.out.println("ranjit doj="+ranjit.doj);
		System.out.println("ranjit empid="+ranjit.empid);
		
		Nurses shikha=new Nurses();
		shikha.age=31;
		shikha.empid=001;
		shikha.dept="gyno";
		shikha.doj="26/03/2020";
		
		System.out.println("shikha age="+shikha.age);
		System.out.println("shikha dept="+shikha.dept);
		System.out.println("shikha doj="+shikha.doj);
		System.out.println("shikha empid="+shikha.empid);
		
		
		
		
		
		
		
	}
		

	}

