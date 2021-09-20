import java.rmi.*;

public interface Calculator extends Remote {
	
	double addition(double x, double y) throws RemoteException;
	double subtraction(double x, double y) throws RemoteException;
	double multiplication(double x, double y) throws RemoteException;
	int devide(double x, double y) throws RemoteException;
	double getCommonLogarithm(double x) throws RemoteException;
	double getNaturalLogarithm(double x) throws RemoteException;
	double getSquare(double x) throws RemoteException;
	long exponentiation(double x, double y) throws RemoteException;
	double getSin(double degrees) throws RemoteException;
	double getCos(double degrees) throws RemoteException;
}
