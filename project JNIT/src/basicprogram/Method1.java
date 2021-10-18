package basicprogram;
class Restaurent{
void menu() { 
System.out.println("idly,dosa,puri,sabji");
}
void takeorder(String order1) {
	System.out.println("order1 is taken:");
}
String serveFood() { 
return "idly";
	}
String payBill(int Amount) {
	return "paid";
}
}
public class Method1 {
public static void main(String[] args) {
		Restaurent palance=new Restaurent();
		palance.menu();
		palance.takeorder("Dosa");
		System .out.println("food is serve:"+palance.serveFood());
		System .out.println("amount is paid:"+palance.payBill(456));
		
		
		
		
		
	}

}
