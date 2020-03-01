package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				LocateRegistry.createRegistry(1099);
				IBanque_Remote_Impl ob= new IBanque_Remote_Impl();
				//afficher ref de l'object distant 
				System.out.println(ob.toString());
				//publier la reference
				//( adresse annuaire , ob)
				Naming.rebind("rmi://localhost:1099/BK", ob);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
