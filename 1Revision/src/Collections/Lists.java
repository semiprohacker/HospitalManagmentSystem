package Collections;
import String.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//ArrayList-Manipulation with ArrayList is slow 
//| act as a list | 
//	memory location for the elements of an ArrayList is contiguous.
// its good for iteration as the elements are stored to next to each other

//LinkedList-Manipulation with LinkedList is faster | 
//	act as a list and queue |
//	The location for the elements of a linked list is not contagious.
//its good if you have multiple add and remove operations not for iteration


//ArrayLists(Class) implements List(Interface) extends Collection(interface)
//LinkedLists(Class) implements List,Dequeue,cloneable, serializable(Interface) extends Collection(interface)
// Generics are used to define the type of list for type safety (Eg: if you pass a string instead of integer)
public class Lists {

	public static void main(String[] args) {
		
		//this creates an abstract list in which add dosen't work
		List<String> asList=Arrays.asList("a","b","c","d","e","f","g","h");
		System.out.println("Class : "+asList.getClass());
		System.out.print(">>>>>  List Manipulation  ");
		seperator();
		System.out.println();
		
		List<String> list=new ArrayList<>();
		list.addAll(0,asList);
		
		
		Strings.line();
		
		
		System.out.println("asList.get(0) : "+asList.get(0));
		Strings.line();
		
		list.add("i");
		System.out.println("list.add(\"i\") : "+list);
		
		list.add(3,"j");
		System.out.println("list.add(3,\"j\") : "+list);
		Strings.line();
		
		System.out.println("list.indexOf(\"j\") : "+list.indexOf("j"));
		Strings.line();
		
		list.add("j");
		System.out.println("list.add(\"j\") : "+list);
		System.out.println("list.lastIndexOf(\"j\") : "+list.lastIndexOf("j"));
		Strings.line();
		
		list.remove("j");//removes the first element it matches
		System.out.println("list.remove(\"j\") : "+list);
		
		list.remove(9);
		System.out.println("list.remove(9) : "+list);
		Strings.line();
		
		System.out.println("list.set(5,\"z\") : "+list.set(5,"z"));
		Strings.line();
		
		System.out.println();
		System.out.print(">>>>>  List Methods  ");
		seperator();
		System.out.println();
	
		System.out.println("list.contains(\"i\") : "+list.contains("i"));
		System.out.println("list.containsAll(asList) : "+list.contains(asList));// checks if asList has all elements of list
		Strings.line();
		
		System.out.println("list.size() : "+list.size());
		Strings.line();
		
		System.out.println("list.isEmpty() : "+list.isEmpty());
		Strings.line();
		
		Collections.reverse(list);
		System.out.println("Collections.reverse(list) : "+list);
		Strings.line();
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Collections.sort(list,Collections.reverseOrder()) : "+list);
		
		Collections.sort(list);
		System.out.println("Collections.sort(list) : "+list);
		Strings.line();
		
		System.out.println("Collections.frequency(list,\"i\") : "+Collections.frequency(list,"i"));
		Strings.line();
		
		System.out.println("Collections.max(list) : "+Collections.max(list));
		Strings.line();
		
		System.out.println("Collections.min(list) : "+Collections.min(list));
		Strings.line();
		
		System.out.println();
		System.out.print(">>>>>  List Iteration  ");
		seperator();
		System.out.println();
		
		System.out.println("Using external normal for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Strings.line();
		
		System.out.println("Using external enhanced for loop");
		for(String i:list) {
			System.out.println(i);
		}
		Strings.line();
		
		System.out.println("Using internal for loop(forEach) Streams API java8 iteration");
		list.forEach(i->System.out.println(i));
		Strings.line();
		
		//print a comma separated string of list(java 8)
		System.out.println("String.join(\",\", list) : "+String.join(",", list));
		Strings.line();
		
		//print a comma separated string of list(java 8 STream API)
		System.out.println("list.stream().collect(Collectors.joining(\",\")) : "+list.stream().collect(Collectors.joining(",")));
		Strings.line();
		
	}//" : "+

	public static void seperator() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
}
