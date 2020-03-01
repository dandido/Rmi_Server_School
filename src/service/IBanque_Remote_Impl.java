package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class IBanque_Remote_Impl extends UnicastRemoteObject implements IBanque_Remote {

	protected IBanque_Remote_Impl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double conversion(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return 11*mt;
	}

	@Override
	public Date getServerDate() throws RemoteException {
		// TODO Auto-generated method stub
		return new Date();
	}

	
	
}
