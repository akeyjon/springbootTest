package proxy;

public class Test {

    public static void main(String[] args) {
        People p1 = new People();
        p1.setCash(600);
        p1.setVip(true);
        p1.setName("tony");
        
        People p2 = new People();
        p2.setCash(6000);
        p2.setVip(false);
        p2.setName("tom");
        
        People p3 = new People();
        p3.setCash(80000);
        p3.setVip(true);
        p3.setName("key");
        
        ProxyClass pxc = new ProxyClass();
        pxc.setP(p1);
        pxc.buyCar();
        
        pxc.setP(p2);
        pxc.buyCar();
        
        pxc.setP(p3);
        pxc.buyCar();
    }
}
