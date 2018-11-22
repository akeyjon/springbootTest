package lisenter;

public class MyListener implements MyEventListener{

    @Override
    public void handle(MyEvent me) {
        // TODO Auto-generated method stub
        System.out.println("事件源改变了 name属性");
        MyEventSource mes = (MyEventSource) me.getObj();
        System.out.println("由原来的："+mes.getSourceName() + "——》 变为 ：" + me.getName());
    }

}
