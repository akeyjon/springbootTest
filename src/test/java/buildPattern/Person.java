package buildPattern;

public class Person {

    private String head;
    private String foot;
    private String body;
    
    public String getHead() {
        return head;
    }
    public void setHead(String head) {
        this.head = head;
    }
    public String getFoot() {
        return foot;
    }
    public void setFoot(String foot) {
        this.foot = foot;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    @Override
    public String toString() {
        return "Person [head=" + head + ", foot=" + foot + ", body=" + body + "]";
    }
    
    
    
    
}
