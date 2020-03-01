package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface IBanque_Remote extends Remote {

	// tt les methode throw RemoteException
	public double conversion(double mt)throws RemoteException;
	public Date getServerDate()throws RemoteException;
}
