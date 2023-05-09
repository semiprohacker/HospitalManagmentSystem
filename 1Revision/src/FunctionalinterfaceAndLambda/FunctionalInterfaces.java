package FunctionalinterfaceAndLambda;

@FunctionalInterface
public interface FunctionalInterfaces {
	
	void implementMethod();
	
	public default void displayDefault() {
		System.out.println("In Default Display");
	}

	public static void displayStatic() {
		System.out.println("In Static Display");
	}
}
