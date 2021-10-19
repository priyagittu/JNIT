package basicprogram;
class Mnc{
	int id;
	String name;
	String designation;
	void display1() {
		System.out.println("company has lot of information");
	}
}

class Infy extends Mnc {
	void display() {
		System.out.println("company name is infy:");
		System.out.println("company name is infy:" + id);
		System.out.println("company name is infy:" + "name ");
		System.out.println("company name is infy:" + "designation");
	}
}

class Capgi extends Mnc{
	void display() {
		System.out.println("company name is capgi:" + id);
		System.out.println("company name is capgi:"+ "name");
		System.out.println("company name is capgi:" + "designation");

	}
}

public class Inheritence1 {
	public static void main(String[] args) {
		Infy gittu=new Infy();
		gittu.id=23;
		gittu.name="gittu singh";
		gittu.designation="software engineer";
		gittu.display();
		gittu.display1();
		Capgi pittu=new Capgi();
		pittu.id=24;
		pittu.name="pittu singh";
		pittu.designation="sr software engineer";
		pittu.display1();
		pittu.display();
	}
}
