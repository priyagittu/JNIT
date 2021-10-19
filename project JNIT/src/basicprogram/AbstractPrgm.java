package basicprogram;
abstract class Trigo{
	void shape() {
		//System.out.println("shape of trigo is different");
		}
	abstract void size();
	}
class Circle extends Trigo{
 void size(){
	 System.out.println("circle size is small");
		System.out.println("shape of circle is round");
	}
}
class Triangle extends Trigo{
	void size() {
		System.out.println("triangle size is 2x of circle");
		System.out.println("shape of triangle is triangular");
	}
}
class Square extends Trigo{
	void size() {
		System.out.println("square size is 3x of circle");
		System.out.println("shape of square is square size");
	}
}
public class AbstractPrgm {
public static void main(String[] args) {
		Circle ce=new Circle();
		ce.size();
		ce.shape();
		Triangle tr=new Triangle();
		tr.size();
		tr.shape();
		Square sq=new Square();
		sq.size();
		sq.shape();
		
	}

}
