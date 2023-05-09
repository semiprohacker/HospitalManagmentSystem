package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JList;

import String.*;
//HashMap - It maintains no order.
//EnumMap
//LinkedHashMap -  maintains insertion order.
//WeakHashMap - both key and value becomes eligible to garbage collection if a key is no longer referenced from elsewhere in the program.
//TreeMap - maintains ascending order(Sorted using the natural order of its key).
//IdentityHashMap - Identity hash map can add same keys if new objects are created.eg new Integer(4);

//LinkedHashMap(Class) extends HashMap(Class) implements Map(interface)
//TreeMap(Class) Implements SortedMapinterface) extends Map(interface)

public class Maps {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		Map<Integer,String> map1=new HashMap<>();
		map1.put(2,"b");
		map1.put(3,"c");
		map1.put(4,"d");
		map1.put(5,"e");
		map1.put(6,"f");
		
		System.out.print(">>>>>   Map Manipualtion  ");
		Lists.seperator();
		System.out.println();
		
		map.put(1,"a");
		System.out.println("map.put(1,\"a\") : "+map);
		
		map.putAll(map1);
		System.out.println("map.putAll(map1) : "+map);
		
		map.putIfAbsent(3, "c");
		System.out.println("map.putIfAbsent(3, \"c\") : "+map);
		Strings.line();
		
		
		System.out.println("map.get(2) : "+map.get(2));
		System.out.println("map.getOrDefault(2,\"NoValueFound\") : "+map.getOrDefault(10,"NoValueFound"));
		Strings.line();
		
		map.replace(6, "g");
		System.out.println("map.replace(6, \"g\") : "+map);
		Strings.line();
		
		map.remove(6);
		System.out.println("map.remove(6) : "+map);
		Strings.line();
		
		System.out.println();
		System.out.print(">>>>>   Map Methods  ");
		Lists.seperator();
		System.out.println();
		
		System.out.println("map.containsKey(1) : "+map.containsKey(1));
		System.out.println("map.containsValue(\"b\") : "+map.containsValue("b"));
		Strings.line();
		
		System.out.println("map.entrySet() : "+map.entrySet());
		Strings.line();
		
		System.out.println("map.keySet() : "+map.keySet());
		Strings.line();
		
		System.out.println("map.values() : "+map.values());
		Strings.line();
		
		System.out.println("map.size() : "+map.size());
		Strings.line();
		
		System.out.println();
		System.out.print(">>>>>   Map Iteration  ");
		Lists.seperator();
		System.out.println();
		
		System.out.println("Using external enhanced for loop");
		for(Integer i:map.keySet()) {
			System.out.println(map.get(i));
		}
		Strings.line();
		
		System.out.println("Using internal forEach loop (Java 8 Using Stream API)");
		map.forEach((k,v)->System.out.println(k+":"+v));
		Strings.line();
		
		System.out.println(String.join(",", map.values()));
		Strings.line();
		
		System.out.println(map.entrySet().stream().map(e->e.getValue()).collect(Collectors.joining(",")));
		Strings.line();
		
		
	}

}
