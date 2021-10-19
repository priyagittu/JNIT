package basicprogram;
abstract class Car{
	String name;
	int milage;
	String colour;
	String features;
	void run() {
		System.out.println("cars run on petrol");
	}
	abstract void special();
}
class Bmw extends Car{
	
	void display(){
		System.out.println("bmw is giving milage:" + milage);
		System.out.println("colour of bmw:" +"black" );
}
	void special() {
		
	}
}
class Audi extends Car{
	void display() {
	
	System.out.println("Audi is giving milage:" + milage);
	System.out.println("colour of bmw:" + "white");
		
	}
    void special() {
		
	}
}
class Honda extends Car{
	void display() {
		System.out.println("Audi is giving milage:" + milage);
		System.out.println("colour of bmw:" + "red");
	}
    void special() {
		
	}
}
public class MethodOveriding1 {

	public static void main(String[] args) {
		Bmw cr=new Bmw();
		cr.milage=342;
		cr.colour="black";
		cr.display();
		cr.run();
		Audi pr=new Audi();
		pr.milage=3421;
		pr.colour="white";
		pr.display();
		pr.run();
		Honda br=new Honda();
		br.milage=3445;
		br.colour="red";
		br.display();
		br.run();
	}

}
