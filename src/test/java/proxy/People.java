package proxy;

public class People implements BuyCar{

    
    private int cash;
    private boolean vip;
    private String name;
    
    @Override
    public void buyCar() {
        // TODO Auto-generated method stub
        System.out.println(this.name+"购买新车");
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    
}
