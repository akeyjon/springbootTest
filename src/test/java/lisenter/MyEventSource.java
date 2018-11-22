package lisenter;

import java.util.EventListener;
import java.util.LinkedList;
import java.util.List;

public class MyEventSource {
    
    

    private List<MyEventListener> list = new LinkedList<>();
    
    private String sourceName;
    
    public void registerListener(MyEventListener eventListener){
        if(!list.contains(eventListener)){
            list.add(eventListener);
        }
    }
    
    public void removeListener(MyEventListener eventListener){
        if(list.contains(eventListener)){
            list.remove(eventListener);
            
        }
    }
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        if(this.sourceName == null && sourceName != null){
            notifyAll(new MyEvent(this, sourceName));
        }else if(this.sourceName != null && sourceName == null){
            notifyAll(new MyEvent(this, sourceName));
        }else if(sourceName != null && this.sourceName != null && !sourceName.equals(this.sourceName)){
            notifyAll(new MyEvent(this, sourceName));
        }
        this.sourceName = sourceName;
    }
    
    /**
     * 通知方法
     * @param event
     */
    public void notifyAll(MyEvent event){
        for(MyEventListener mel : list){
            mel.handle(event);
        }
    }
    
    
}
