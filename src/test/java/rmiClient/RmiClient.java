package rmiClient;

import java.rmi.RemoteException;
import java.util.Enumeration;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingException;


public class RmiClient {

    public static void main(String[] args) throws NamingException, RemoteException {
        Context namingContext = new InitialContext();
        System.out.println("client: rmi registry bindings...");
        Enumeration<NameClassPair> e = namingContext.list("rmi://localhost:7799/");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement().getName());
            
        }
        String url = "rmi://localhost:1099/app_price_api";
        ApplePrice ap =(ApplePrice) namingContext.lookup(url);
        String des = "iphone 8";
        int price = ap.getPrice(des);
        System.out.println("price = "+price);
    }
}
