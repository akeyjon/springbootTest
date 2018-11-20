package desginPattern;

public class FactoryA implements Factory{
    
    @Override
    public Product getProduct(){
        return new ProductA();
    }

}
