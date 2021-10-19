package basicprogram;
class Mother{
	Mother(int age,String name){
	System.out.println("age of mother is :" + age);
	System.out.println("name of mother is :"+ name);
	}
	}
class Son extends Mother{
	Son(int age,String name,double height){
		super(56,"sudha");
		System.out.println("age of son is :"+ age);
		System.out.println("height of son is :" + height);
		System.out.println("name of son is :" + name);
}
	
}
public class SuperCons {

	public static void main(String[] args) {
	Son so= new Son(24,"mayank",5.8);
	

	}

}
