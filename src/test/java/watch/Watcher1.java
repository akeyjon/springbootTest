package watch;

public class Watcher1 extends BaseWatcher implements Watcher{

    
    @Override
    public void update() {
        // TODO Auto-generated method stub
        this.setName("watcher1");
        this.setAge(18);
    }

}
