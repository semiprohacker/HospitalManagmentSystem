package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import String.*;
//HashSet - no order
//LinkedHashSet(class) implements Set 
//LinkedHashSet - maintains insertion order
//TreeSet - maintains sorted order default-ascending 
//EnumSet

//HashSet(class)|LinkedHash Set(class) implements Set extends Collection(interface)
//TreeSet(class) implements Navigable Set(interface) extends Sorted Set(interface) extends Set(interface) extends Collection(interface)


public class Sets {
	
	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		List<String> list =Arrays.asList("f","g","h");
		
		System.out.print(">>>>>   Set Manipualtion  ");
		Lists.seperator();
		System.out.println();
		
		set.add("a");set.add("b");set.add("c");set.add("d");set.add("e");set.add("f");set.add("g");set.add("h");
		System.out.println(set);
		Strings.line();
		
		set.add("i");
		System.out.println("set.add(\"i\") : "+set);
		Strings.line();
		
		set.remove("i");
		System.out.println("set.remove(\"i\") : "+set);
		Strings.line();
		
		set.removeAll(list);
		System.out.println("list : "+list);
		System.out.println("set.removeAll(list) : "+set);
		Strings.line();
		
		System.out.println();
		System.out.print(">>>>>   Set Methods  ");
		Lists.seperator();
		System.out.println();
	
		System.out.println("set.isEmpty() : "+set.isEmpty());
		Strings.line();
		
		System.out.println("set.size() : "+set.size());
		Strings.line();
		
		System.out.println("set.contains(\"b\") : "+set.contains("b"));
		Strings.line();
		
		System.out.println();
		System.out.print(">>>>>   Set Iteration  ");
		Lists.seperator();
		System.out.println();
		
		
		System.out.println("Using external set.iterator() ");
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Strings.line();
		
		
		System.out.println("Using external normal for loop ");
		System.out.println("Normal For Loop Cant be Used As HashSets Do Not Have Indexing ".toUpperCase());
		
		
		System.out.println("Using external enhanced for loop");
		for(String i:set) {
			System.out.println(i);
		}
		Strings.line();
		
		System.out.println("Using internal for loop(forEach) Streams API java8 iteration");
		set.forEach(i->System.out.println(i));
		Strings.line();
		
		//print a comma separated string of list(java 8)
		System.out.println("String.join(\",\", set) : "+String.join(",", set));
		Strings.line();
		
		//print a comma separated string of list(java 8 STream API)
		System.out.println("set.stream().collect(Collectors.joining(\",\")) : "+set.stream().collect(Collectors.joining(",")));
		Strings.line();
	
	
	}

}
