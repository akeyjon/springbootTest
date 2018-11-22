package lisenter;


public class MyEvent {

    private Object obj;
    private String  name;
    
    public MyEvent(Object source, String name) {
        this.obj = source;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Object getObj() {
        return obj;
    }
    public void setObj(Object obj) {
        this.obj = obj;
    }

}
