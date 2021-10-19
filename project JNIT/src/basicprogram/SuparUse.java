package basicprogram;
class Father{
	int age=54;
}
class Baby extends Father{
	int age=20;
	void display() {
		System.out.println("age of father is:" + super.age);
		System.out.println("age of child is :" + age);
	}
	
}
public class SuparUse {

	public static void main(String[] args) {
		Baby by=new Baby();
		by.display();

	}

}
