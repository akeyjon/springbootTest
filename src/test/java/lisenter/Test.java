package lisenter;

public class Test {

    public static void main(String[] args) {
        MyEventSource mes = new MyEventSource();
        MyEventListener mel = new MyListener();
        mes.registerListener(mel);
        mes.setSourceName("key");
        mes.setSourceName("tom");
    }
}
