package String;

import java.util.Arrays;

//All objects are stored in the heap and string is also an object
//String are stored in string pool which is a heap type of memory



public class Strings {

	public static void main(String[] args) {
		
		String str="Hello";
		String str1= "Hello";
		String str2=new String("Hello");
		String hello="hello";
		String loremIpsum="   Hello hello HELLO hello HELLO Hello   ";
		String bye="bye";
		char[] arr= new char[10];
		
		//== compares addresses
		System.out.println("str==str1 : "+(str==str1));// we haven't created a new str1 object here so both str & str1 refer to the same address
		System.out.println("str==str2 : "+(str==str2));// we have created  new string object str2 so the new object is stored in a new place hence the answer is false
		
		line();
		// as we can see the hash-code of all the strings are same irrespective of the address, so hash-code != address 
		//hash-code gives us a code based on the literals present in the string
		System.out.println("Hashcodes : "+str.hashCode()+", "+str1.hashCode()+", "+str2.hashCode());
		
		line();
		
		System.out.println("str.equals(str1) : "+str.equals(str1));
		System.out.println("str.equals(str2) : "+str.equals(str2));
		System.out.println("str.equals(hello) : "+str.equals(hello));
		System.out.println("str.equalsIgnoreCase(hello) : "+str.equalsIgnoreCase(hello));
		
		line();
		
		System.out.println("str.length() : "+str.length());
		
		line();
		
		System.out.println("str.indexOf('l') : "+(str.indexOf('l')));//prints the index of the given character
		System.out.println("str.charAt(3) : "+(str.charAt(3)));//prints the character at given index
		
		line();
		
		System.out.println("loremIpsum.replace(\"hello\", \"p\") : "+loremIpsum.replace("hello", "p"));
		
		line();
		
		System.out.println("loremIpsum.toLowerCase() : "+loremIpsum.toLowerCase());
		System.out.println("loremIpsum.toUpperCase() : "+loremIpsum.toUpperCase());
		
		line();
		
		System.out.println("loremIpsum.substring(4,19) : "+loremIpsum.substring(4,19));
		
		line();
		
		// kinda deprecated System.out.println(loremIpsum.trim());
		System.out.println("loremIpsum.strip() : "+loremIpsum.strip());
		
		System.out.println("str.compareTo(bye) : "+(str.compareTo(bye)));//Compares two strings lexicographically(according to dictionary,ASCII) 
		System.out.println("str.compareToIgnoreCase(bye) : "+(str.compareToIgnoreCase(bye)));//Compares two strings lexicographically(according to dictionary)
		
		line();
		
		//to know more diff in concat & + operator refer below link 
		//https://www.tutorialspoint.com/difference-between-concat-and-plus-operator-in-java#:~:text=%2B%20operator%20could%20take%20any%20type,append%20to%20the%20target%20string.&text=The%20concat%20method%20would%20create,string%20as%20an%20output%20object.
		System.out.println("str.concat(bye) : "+str.concat(bye));
		System.out.println("str+\" \"+bye : "+str+" "+bye);
		System.out.println(100+200+str+100+200+" <<-- 100+200+str+100+200 ");// the numbers before str are considered as int and numbers after str are considered as string
		
		line();
		
		System.out.println("str.contains(\"o\") : "+str.contains("o"));
		
		line();
		
		System.out.println("str.endsWith(\"lo\") : "+str.endsWith("lo"));
		
		line();
		
		System.out.println(str.toCharArray());
		
		str.getChars(0, 5, arr, 2);//(start,end,destination array,displacement)
		System.out.print("str.getChars(0, 5, arr, 2) : ");
		System.out.println(arr);
		
		line();
		System.out.println("str : "+System.identityHashCode(str));
		System.out.println("str1 : "+System.identityHashCode(str1));
		System.out.println("str2 : "+System.identityHashCode(str2));
		System.out.println("hello : "+System.identityHashCode(hello));
		hello="Hello";
		System.out.println("hello : "+System.identityHashCode(hello));
		hello="random";
		System.out.println("hello : "+System.identityHashCode(hello));
	}
	//" : "+
	public static void line() {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
}




