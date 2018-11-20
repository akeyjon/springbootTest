package watch;

public class Watcher2 extends BaseWatcher implements Watcher{

    
    @Override
    public void update() {
        // TODO Auto-generated method stub
        this.setName("watcher2");
        this.setAge(18);
    }

}
