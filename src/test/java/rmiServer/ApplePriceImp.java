package rmiServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class ApplePriceImp extends UnicastRemoteObject implements ApplePrice{

    
    private Map<String, Integer> map;
    protected ApplePriceImp() throws RemoteException {
        super();
        map = new HashMap<String, Integer>();
        map.put("iphone 8", 5888);
        map.put("iphone X", 8888);
    }

    @Override
    public int getPrice(String description) throws RemoteException {
        // TODO Auto-generated method stub
        Integer i = map.get(description);
        return i == null ? 0:i;
    }

}
