package buildPattern;

public class ManBuilder implements PersonBuilder{

    private Person p;
    
    public ManBuilder(){
        p = new Man();
    }
    
    @Override
    public void buildHead() {
        // TODO Auto-generated method stub
        p.setHead("构建男人的 头");
    }

    @Override
    public void buildFoot() {
        // TODO Auto-generated method stub
        p.setFoot("构建男人的 jiao");
        
    }

    @Override
    public void buildBody() {
        // TODO Auto-generated method stub
        p.setBody("构建男人的 身子");
        
    }

    @Override
    public Person buildPerson() {
        // TODO Auto-generated method stub
        return p;
    }

}
