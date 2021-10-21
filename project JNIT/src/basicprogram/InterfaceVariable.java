package basicprogram;
interface Parent{
	int age=55;  //static variable
	}
interface Child extends Parent{  // (we use extends between two interface class )
	int age=23;
}
class Vote implements Child{  //  child,parents(we can write)
	void detail() {
		System.out.println("age of parents is:"+ Parent.age);//    we take class name becuase variable is static
		System.out.println("age of child is:" + Child.age);
	}
	
}
public class InterfaceVariable {

	public static void main(String[] args) {
		Vote vo=new Vote();
		vo.detail();
		
		

	}

}
