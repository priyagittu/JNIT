package basicprogram;
 class Person{
	 float weight;
	 String name;
	 int age;
	 String adress;
 }
 class Furniture{
	 int noOfItem;
	 String name;
	 String type;
 }
 public class Variable3 {
 public static void main(String[] args) {
	 Person hari=new Person();
	 hari.weight=65.5f;
	 hari.age=48;
	 hari.adress="52 lane street,pune";
	 
	 System.out.println("weight of hari is:"+hari.weight);
	 System.out.println("age of hari is:"+hari.age);
	 System.out.println("adress of hari is:"+hari.adress);
	 
	 Furniture chair=new Furniture();
	 chair.noOfItem=4;
	 chair.name="apsan chair";
	 chair.type="hanging chair";
	 
	 System.out.println("noofitem of chair is:"+chair.noOfItem);
	 System.out.println("name of chair is:"+chair.name);
	 System.out.println("type of chair is:"+chair.type);
	 }
}
