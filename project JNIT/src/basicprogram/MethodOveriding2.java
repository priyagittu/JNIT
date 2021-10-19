package basicprogram;
class Teacher{
	void teach() {
		System.out.println("teacher is teaching ");
	}
}
class PhysicsTeacher extends Teacher{
	int age;
	String name;
	void does() {
		System.out.println("age of physics teacher is: "+ age);
		System.out.println("name of physics teacher is:"+ name);
	}
}
class ChemistryTeacher extends Teacher{
	float height;
	String gender;
	void does() {
		System.out.println("age of chemestry teacher is: "+ height);
		System.out.println("name of physics teacher is:"+ gender);
	
	}
}
public class MethodOveriding2 {
public static void main(String[] args) {
	Teacher ch=new Teacher();
	ch.teach();
		PhysicsTeacher rohan=new PhysicsTeacher();
		rohan.age=45;
		rohan.name="rohan";
		rohan.does();
		
		ChemistryTeacher ranjit=new ChemistryTeacher();
		ranjit.height=5.8f;
		ranjit.gender="male";
		ranjit.does();
		
		

	}

}
