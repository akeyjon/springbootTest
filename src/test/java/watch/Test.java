package watch;

public class Test {

    public static void main(String[] args) {
        
        Watcher w1 = new Watcher1();
        Watcher w2 = new Watcher2();
        
        Watched w = new Watched1();
        w.addWatcher(w1);
        w.addWatcher(w2);
        
        w.notifies();
    }
    
    
    
}
