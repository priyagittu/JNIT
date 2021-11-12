import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class CollectionSet {
	public static void main(String[] args) {
		TreeSet<String> hs=new TreeSet<String>();
		hs.add("A");
		hs.add("b");
		hs.add("d");
		hs.add("f");
		hs.add("h");
		hs.add("");
		hs.add("s");
		hs.add("m");
		hs.add("A");
		System.out.println(hs);
		hs.addAll(List.of("A", "B", "C"));
		System.out.println(hs);
		System.out.println( "hashset contains Z or not::" + hs.contains("Z"));
        System.out.println( "Hash set contains all 3 string or not::" + hs.containsAll(List.of("A", "B", "C")));
        System.out.println(hs.isEmpty());
        System.out.println(hs.headSet("h"));
        System.out.println(hs.subSet("f",true ,"m",true));

        TreeSet<String> hs1 = (TreeSet<String>) hs.clone();
        System.out.println( "hashCode hs:" + hs.hashCode());
        System.out.println( "hashCode hs1:" + hs1.hashCode());
        System.out.println( "hashCode ranjit:" + "ranjit".hashCode());
        System.out.println( hs.equals(hs1));
	}
//treeset and linkedHashSet are the other class of set interface
}
