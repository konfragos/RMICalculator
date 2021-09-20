import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
	
	private static final String HOST = "localhost";
	private static final int PORT = Registry.REGISTRY_PORT; // 1099
	
	public static void main(String[] args)throws RemoteException, NotBoundException, InterruptedException {
	
		// Locate rmi registry
		Registry reg = LocateRegistry.getRegistry(HOST, PORT);
			
		// Look up for a soecific name and get remote reference (stub)
		String rmiObjectName = "Calculator";
		Calculator ref = (Calculator)reg.lookup(rmiObjectName);
			
		// Do remote method invocation		
		// Αddition between two numbers
		double x = 60;
		double y = 30;
		double result = ref.addition(x,y);
		System.out.println(+x+ " + " +y+ " = " +result );
			
		// Subtraction between two numbers
		result = ref.subtraction(x,y);
		System.out.println(+x+ " - " +y+ " = " +result );
			
		// Multiplication between two numbers
		result = ref.multiplication(x,y);
		System.out.println(+x+ " * " +y+ " = " +result );
			
		// Devide between two numbers
		result = ref.devide(x,y);
		System.out.println(+x+ " / " +y+ " = " +result );
			
		// Common logarithm (base 10) of a number
		result = ref.getCommonLogarithm(x);
		System.out.println("log10(" +x+ ") = " +result );
			
		// Natural logarithm of a number
		result = ref.getNaturalLogarithm(x);
		System.out.println("ln(" +x+ ") = " +result );
			
		// Square root of a number 
		result = ref.getSquare(x);
		System.out.println("sqrt("+x+ ") = " +result );
			
		// X power of Y
		long result2 = ref.exponentiation(x,y);
		System.out.println(+x+ " ^ " +y+ " = " +result2 );

		// Sine of a number
		result = ref.getSin(x);
		System.out.println("sin(" +x+ ") = " +result );
			
		// Cosine of a number
		result = ref.getCos(x);
		System.out.println("cos(" +x+ ") = " +result );			
	}
}
