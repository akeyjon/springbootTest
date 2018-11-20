package proxy;

public class ProxyClass implements BuyCar{

    private People p;
    
    public ProxyClass(){}
    public ProxyClass(People people){
        this.p = people;
    }
    public People getP() {
        return p;
    }


    public void setP(People p) {
        this.p = p;
    }


    @Override
    public void buyCar() {
        // TODO Auto-generated method stub
        if(p.isVip()){
            if(p.getCash() >  5000){
                p.buyCar();
            }else{
                System.out.println(p.getName()+"金钱不够");
            }
        }else{
            System.out.println(p.getName()+"不是vip");
        }
    }

}
