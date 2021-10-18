package basicprogram;
class Animal {
	int age;
	double height;
	String name;
	String nature;
	
	Animal (int age,double height,String nature,String name){
		this.age= age;
		this.height= height;
		this.nature= nature;
		this.name=name;
		
	}
	void display() {
		System.out.println("name of animal is:"+ name);
		System.out.println("height of " + name + " is:"+ height);
		System.out.println("age of " + name + " is:"+ age);
		System.out.println("nature of "+name + " is:"+ nature);
		
	}
}
public class Constructor1 {
public static void main(String[] args) {
	Animal tiger=new Animal(60,7.4,"roar","tiger");
	tiger.display();
	Animal lion=new Animal(64,5.4,"roar","lion");
	lion.display();
	Animal monkey=new Animal(15,3.2,"chatter","monkey");
	monkey.display();
	}
}
