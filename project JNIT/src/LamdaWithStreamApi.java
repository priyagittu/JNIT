import java.util.ArrayList;
import java.util.List;


public class LamdaWithStreamApi {
    // create an object of list using ArrayList
   static List<String> places = new ArrayList<>();

    // preparing our data
    public static List getPlaces(){
    	List<Integer>al=List.of(34, 25, 56, 1, 56, 45, 67, 56, 78, 12,45,56);
//al.add(12);
//al.add(13);
//al.add(14);
//al.add(15);
        // add places and country to the list
    	
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        places.add("Nepal, aba");

       return places;
    }

    public static void main( String[] args ) {

        List<String> myPlaces = getPlaces();
        
        System.out.println("Places from Nepal:");
        
        // Filter places from Nepal
       myPlaces.stream().filter((p) -> p.startsWith("")).map((p) -> p.endsWith("a")).sorted().forEach((p) -> System.out.println(p));
              //  .filter((p) -> p.startsWith("Nepal"))
               // .map((p) -> p.toUpperCase())
               // .sorted()
              //  .forEach((p) -> System.out.println(p));
    }

}

