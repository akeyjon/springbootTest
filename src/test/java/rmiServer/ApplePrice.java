package rmiServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ApplePrice extends Remote{

    int getPrice(String description) throws RemoteException;
}
