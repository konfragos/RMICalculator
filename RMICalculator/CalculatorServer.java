import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServer {
	
	private static final String HOST = "localhost";
	private static final int PORT = Registry.REGISTRY_PORT;
	
	public static void main(String[] args) throws Exception {
		
		// Remote object creation
		Calculator rObj = new CalculatorImpl();
		
		// Create or loacte rmiregistry, register and bind object
		Registry reg = LocateRegistry.createRegistry(PORT);

		// Bind remote object to a name and publish in rmi registry      
		String rmiObjectName = "Calculator";
		reg.rebind(rmiObjectName, rObj);
		System.out.println("Remote object bounded.");
		
		// Server is running until we press a key
		System.out.println("Press <Enter> for exit.");
		System.in.read();
				
		// Free space and clear rmi registry
		UnicastRemoteObject.unexportObject(rObj, true);
		reg.unbind(rmiObjectName);
		System.out.println("Remote object unbounded.");
	}
}
