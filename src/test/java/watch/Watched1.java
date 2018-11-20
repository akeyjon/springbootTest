package watch;

import java.util.ArrayList;
import java.util.List;


public class Watched1 implements Watched{

    private List<Watcher> watchers = new ArrayList<Watcher>();
    
    
    @Override
    public void addWatcher(Watcher w) {
        // TODO Auto-generated method stub
        watchers.add(w);
    }

    @Override
    public void removeWatcher(Watcher w) {
        // TODO Auto-generatedw method stub
        watchers.remove(w);
    }

    @Override
    public void notifies() {
        // TODO Auto-generated method stub
        for(Watcher w : watchers){
            w.update();
            System.out.println(w);
        }
    }

    
}
