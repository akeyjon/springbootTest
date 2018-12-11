package fast;

public class Apple {

    
    private String name;
    private int price;
    
    public static Apple valueOf(){
        return new Apple();
    } 
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple [name=" + name + ", price=" + price + "]";
    }
    
    
}
