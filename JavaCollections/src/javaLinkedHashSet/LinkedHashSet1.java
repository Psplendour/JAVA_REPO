package javaLinkedHashSet;
//Java LinkedHashSet Example
import java.util.*;
public class LinkedHashSet1 {

	public static void main(String[] args) {
		//Creating HashSet and adding elements  
               LinkedHashSet<String> set=new LinkedHashSet<String>();  
               set.add("One");    
               set.add("Two");    
               set.add("Three");   
               set.add("Four");  
               set.add("Five");  
               Iterator<String> i=set.iterator();  
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               }  

	}

}
//Duplicate not allowed
//Insertion Order Preserved 