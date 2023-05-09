package FunctionalinterfaceAndLambda;

import java.lang.annotation.Annotation;

public class TestClass  {

	public FunctionalInterfaces impl() {
		FunctionalInterfaces fi=()->{System.out.println("hello");};
		return fi;
	}
	
	public static void main(String[] args) {
		TestClass tc=new TestClass();
		
		FunctionalInterfaces fi1=tc.impl();
		fi1.displayDefault();
		FunctionalInterfaces.displayStatic();
	}
	
}



