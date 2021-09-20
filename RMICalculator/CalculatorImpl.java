import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

	private static double result;
	private static long result2;
	
	// Constructor
	public CalculatorImpl() throws RemoteException{
		super();
	}
		
	// Code
	
	public double addition(double x, double y) {
		result = x + y;
		return result;
	}
	
	public double subtraction(double x, double y) {
		result = x - y;
		return result;
	}
	
	public double multiplication(double x, double y) {
		result = x * y;
		return result;
	}
	
	public int devide(double x, double y) {						
			return (int) (x / y);	
	}
	
	public double getCommonLogarithm(double x) {
		result = Math.log10(x);
		return result;
	}
	
	public double getNaturalLogarithm(double x) {
		result = Math.log(x);
		return result;
	}
	
	public double getSquare(double x) {
		result = Math.sqrt(x);
		return result;
	}
	
	public long exponentiation(double x, double y) {
		result2 = (long) Math.pow(x, y);
		return result2;
	}
	
	public double getSin(double degrees) {		
		// sin() method to get the sine value 
		result = Math.sin(degrees);
		
		//return the sine value
		return result;
	}
	
	public double getCos(double degrees) {
		// cos() method to get the cosine value 
		result = Math.cos(degrees);
		
		//return the cosine value
		return result;
	}
}
