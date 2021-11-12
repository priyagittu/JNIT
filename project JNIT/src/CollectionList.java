import java.util.ArrayList;
import java.util.List;
public class CollectionList {
public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
                 al.add(45);
                 al.add(40);
                 al.add(14);
                 al.add(12);
                 al.add(9);
                 al.add(34);
                 al.add(56);
                 al.add(78);
                 al.add(34);
                 al.add(76);
                 al.add(40);
                 System.out.println("list include duplicate values as well:" + al);
                 System.out.println("add all will add some element:" + al.addAll(List.of(2,4,5)));
                 System.out.println(al);
                 System.out.println(al.contains(20));
                 System.out.println(al.containsAll(List.of(78,56,6)));
                 System.out.println(al.hashCode());
                 System.out.println(al.indexOf(40));
                 System.out.println(al.lastIndexOf(al));
                 System.out.println(al.getClass());
                 System.out.println(al.remove(4));
                 System.out.println(al);
                 System.out.println(al.subList(2, 7));//we have to give index number
                 System.out.println(al.toString());
                 System.out.println(al.iterator());
                 System.out.println(al.set(1, 20));
                 System.out.println(al);
                 System.out.println(al.stream());
	}


}
