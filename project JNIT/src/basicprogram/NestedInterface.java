package basicprogram;
interface Hospital1{
	String name="apollo";
interface Doctor1{
	String name="radha";
	}
}
class Medical implements Hospital1{
	void detail() {
		System.out.println("name of hospital is:" +  Hospital1.name);
		System.out.println("name of doctor is:" + Doctor1.name);
	}
}
public class NestedInterface {

	public static void main(String[] args) {
		Medical me=new Medical();
		me.detail();

	}

}
