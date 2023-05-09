package String;

public class StringBufferAndBuilder{
	
	//STring buffers And Builders are Mutable and STring are immutable;

	public static void main(String[] args) {
		
	// the only diff between string-buffer and string-builder is string buffer is thread safe
	//String builder takes less space and time
		
	//StringBuffer sb= new StringBuffer("hello");
	StringBuilder sb= new StringBuilder("hello");
	System.out.println("sb.length() : "+sb.length());
	Strings.line();
	
	System.out.println("sb.capacity() : "+sb.capacity());
	Strings.line();
	
	System.out.println("System.identityHashCode(sb) : " + System.identityHashCode(sb));
	Strings.line();
	
	sb.insert(0,"random, ");
	System.out.println("sb.insert(0,\"random,\") : "+sb);
	Strings.line();
	
	System.out.println("System.identityHashCode(sb) : " +System.identityHashCode(sb));
	Strings.line();
	
	sb.append(", hie");
	System.out.println("sb.append(\", hie\") : "+sb);
	Strings.line();
	
	sb.replace(7, 11," 'Replaced' ");
	System.out.println("sb.replace(7, 8,\" Replaced \") : "+sb);
	Strings.line();
	
	sb.delete(2, 5);
	System.out.println("sb.delete(2, 5) : "+sb);
	Strings.line();
	
	sb.reverse();
	System.out.println("sb.reverse() : "+sb);
	sb.reverse();
	Strings.line();
}
}