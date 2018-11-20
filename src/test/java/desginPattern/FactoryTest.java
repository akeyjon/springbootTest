package desginPattern;

public class FactoryTest {

    public static void main(String[] args) {
        
        Factory f = new FactoryA();
        f.getProduct();
        f = new FactoryB();
        f.getProduct();
    }
}
