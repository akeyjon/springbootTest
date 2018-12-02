package rmiServer;

import java.rmi.RemoteException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ApplePriceServer {

    public static void main(String[] args) throws RemoteException, NamingException {
        System.out.println("开始 自举注册。。。");
        ApplePriceImp api = new ApplePriceImp();
        System.out.println("binding...");
        Context namingContext = new InitialContext();
        namingContext.bind("rmi://localhost:1099/app_price_api", api);
        System.out.println("等待客户端连接。。。");
    }
}
