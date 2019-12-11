package wrapper;

import Util.Stub.GenericDao;
import Util.Stub.IGenericDao;
import dao.Implementation.OptionSetDao;
import dao.Implementation.PizzaConfigDao;
import dao.Implementation.PizzaOptionDao;

import java.rmi.AlreadyBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import Util.Proxy.IOptionSetProxy;
import Util.Proxy.IPizzaConfigProxy;
import Util.Proxy.IPizzaOptionProxy;

public class ServerApi {
   public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        System.setProperty("java.security.policy","file:./java.policy");
        //System.setProperty("java.rmi.server.hostname","localhost");
        SecurityManager secManager = System.getSecurityManager();
        if (secManager == null) {
            System.setSecurityManager(new RMISecurityManager());
        }

       OptionSetDao optionSetDao = new OptionSetDao();
       PizzaConfigDao pizzaConfigDao = new PizzaConfigDao();
       PizzaOptionDao pizzaOptionDao = new PizzaOptionDao();
       
       IOptionSetProxy optionSetDao1 = (IOptionSetProxy) UnicastRemoteObject.exportObject(optionSetDao, 0);
       IPizzaConfigProxy pizzaConfigDao1 = (IPizzaConfigProxy) UnicastRemoteObject.exportObject(pizzaConfigDao, 0);
       IPizzaOptionProxy pizzaOptionDao1 = (IPizzaOptionProxy) UnicastRemoteObject.exportObject(pizzaOptionDao, 0);
        int port = 2014;
        //Registry rgsty = LocateRegistry.createRegistry(1888);
        Registry registry = LocateRegistry.createRegistry(2000);
       
        registry.rebind("OptionSetDao", optionSetDao1);
        registry.rebind("PizzaConfigDao", pizzaConfigDao1);
        registry.rebind("PizzaOptionDao", pizzaOptionDao1);
        System.out.println("Server is ready ....................");
    }
}
