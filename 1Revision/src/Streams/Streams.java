package Streams;
import String.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,4,3,5);
		
		list.stream().filter(i->i%2==0).forEach(System.out::println);
		Strings.line();
		
		list.stream().filter(i->i%2==1).map(i->i*2).forEach(System.out::println);
		Strings.line();
		
		Predicate<Integer> predicate=i->i%2==0;
		List<Integer> list1=list.stream().filter(predicate).map(i->i*2).collect(Collectors.toList());
		System.out.println(list1);
		Strings.line();
		
		System.out.println("list.stream().mapToInt(i->i).sum() : "+list.stream().mapToInt(i->i).sum());
		Strings.line();
		
		System.out.println("list.stream().reduce(0,Integer::sum) : "+list.stream().reduce(0,Integer::sum));
		Strings.line();
		
		System.out.println("list.stream().reduce(1,(a,b)->a*b) : "+list.stream().reduce(1,(a,b)->a*b));
		Strings.line();
		
		System.out.println("list.stream().mapToInt(i->i).sorted() : "+list.stream().mapToInt(i->i).sorted());
		Strings.line();
		
		System.out.println("list.stream().mapToInt(i->i).average().getAsDouble() : "+list.stream().mapToInt(i->i).average().getAsDouble());
		Strings.line();
		
		System.out.println("list.stream().mapToInt(i->i).max().getAsInt() : "+list.stream().mapToInt(i->i).max().getAsInt());
		Strings.line();
		
		System.out.println("list.stream().reduce(0,Integer::max) : "+list.stream().reduce(0,Integer::max));
		Strings.line();
		
		System.out.println("list.stream().mapToInt(i->i).min().getAsInt() : "+list.stream().mapToInt(i->i).min().getAsInt());
		Strings.line();
		
		System.out.println("list.stream().reduce(1,Integer::min)) : "+list.stream().reduce(1,Integer::min));
		Strings.line();
		
	}

}
