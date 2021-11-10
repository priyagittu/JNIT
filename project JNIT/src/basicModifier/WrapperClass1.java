package basicModifier;
class Sample<X> {
	void show(X a) {
		System.out.println("a :"+ a);
	}
	}
public class WrapperClass1 {
public static void main(String[] args) {
		Sample<Integer> i=new Sample<Integer>() ;
		i.show(20);
		Sample<Double> d=new Sample<Double>() ;
		d.show(34.67);
		Sample<String> s=new Sample<String>() ;
		s.show("ramesh");
	}

}
