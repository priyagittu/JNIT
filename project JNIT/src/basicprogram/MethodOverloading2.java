package basicprogram;
class Restaurent1{
void takeOrder(String order,int no) {
	System.out.println("menu is:" + "idly" + "," + 1);
	
}
	void takeOrder(int no,String order1, String order2) {
		System.out.println("dosa and puri");
	}
	
}
public class MethodOverloading2 {

	public static void main(String[] args) {
		Restaurent1 plasma= new Restaurent1();
		plasma.takeOrder("idly", 1);
		plasma.takeOrder(2,"dosa", "puri");

	}

}
