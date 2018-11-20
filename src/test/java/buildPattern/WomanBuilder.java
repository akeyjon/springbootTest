package buildPattern;

public class WomanBuilder implements PersonBuilder{

    private Person p;
    
    public WomanBuilder(){
        p = new Woman();
    }
    
    @Override
    public void buildHead() {
        // TODO Auto-generated method stub
        p.setHead("构建女人的头");
    }

    @Override
    public void buildFoot() {
        // TODO Auto-generated method stub
        p.setFoot("构建女人的jiao");
    }

    @Override
    public void buildBody() {
        // TODO Auto-generated method stub
        p.setBody("构建女人的身子");
    }

    @Override
    public Person buildPerson() {
        // TODO Auto-generated method stub
        return p;
    }

}
