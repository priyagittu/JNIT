package basicprogram;
interface Vehicle{
	void start();  //abstract method
	void cost(double cost);  //abstract method
	void milage(int x);  //abstract method
	}
class Car1 implements Vehicle{
	public void start() {
		System.out.println("car starts from its power button");
}
	public void cost(double cost) {
		System.out.println("cost of thr car is high:" +  cost);
		}
	public void milage(int x) {
		System.out.println("milage varried from car to car:" +  x);
	}
	}
class Bike implements Vehicle{
	public void start() {
		System.out.println("bikes starts from its key");
}
	public void cost(double cost) {
		System.out.println("cost of bike is lesser then car:" + cost);
		}
	public void milage(int x) {
		System.out.println("milage varried from bike to bike:" + x);
	}
}
class Subaru extends Car1{
	void wiper() {
		System.out.println("it is having 2 wiper in front");
	}
	void glass() {
		System.out.println("glass of subari is strong");
	}
	}
class Pulser extends Bike{
	void handle() {
		System.out.println("handle of pulser is hard ");
		}
	void seat() {
		System.out.println("pulser is 2 seater");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		Subaru su=new Subaru();
		su.start();
		su.milage(345);
		su.cost(500000.56);
		su.wiper();
		su.glass();
		Pulser pu=new Pulser();
		pu.start();
		pu.milage(222);
		pu.cost(100000.56);
		pu.handle();
		pu.seat();
		
		

	}

}
