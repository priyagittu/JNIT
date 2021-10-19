package basicprogram;
class Employer3{
	int emp_id;
	double emp_salary;
	Employer3(int x,double y){
		emp_id=x;
		emp_salary=y;
		
	}
	void display() {
		System.out.println("id of employee:" + emp_id);
		System.out.println("salary of employee:" + emp_salary);
		
		
	}
	
}
public class Constructor3 {

	public static void main(String[] args) {
		Employer3 rohan=new Employer3(45,3457.98);
		rohan.display();
		Employer3 ruhi=new Employer3(46,6754.98);
		ruhi.display();

	}

}
