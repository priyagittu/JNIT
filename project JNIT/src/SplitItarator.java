import java.util.*;  
import java.util.stream.Stream;  
public class SplitItarator { 
     public static void main(String args[]){  
          
         ArrayList<Integer> list = new ArrayList<>();    //Create an object of array list             
          
         list.add(101);  //Add values to the array list.
         list.add(201);  
         list.add(301);  
         list.add(401);  
         list.add(501);                        
         Stream<Integer> str = list.stream();               
        
         Spliterator<Integer> splitr = str.spliterator();     //Get Spliterator object on list                                          
        
         System.out.println("Estimate size: " + splitr.estimateSize());     //Get estimateSize method               
         
         System.out.println("Exact size: " + splitr.getExactSizeIfKnown());    //Print getExactSizeIfKnown method          
         
         System.out.println("Boolean Result: "+splitr.hasCharacteristics(splitr.characteristics()));  //Check for hasCharacteristics and characteristics method            
         System.out.println("Elements of ArrayList :");  
              
         splitr.forEachRemaining((n) -> System.out.println(n));   //Obtain result forEachRemaining method       
          
         Stream<Integer> str1 = list.stream();   //Obtaining another Stream to the array list.
         splitr = str1.spliterator();           
        
         Spliterator<Integer> splitr2 = splitr.trySplit();  //Obtain result from trySplit() method            
        
         if(splitr2 != null) {  
         System.out.println("Output from splitr2: ");  
         splitr2.forEachRemaining((n) -> System.out.println(n));  //If splitr could be split, use splitr2 first.
         }    
         //Now, use the splitr  
         System.out.println("Output from splitr1: ");  
         splitr.forEachRemaining((n) -> System.out.println(n));   //Now, use the splitr  
         }  
}  

