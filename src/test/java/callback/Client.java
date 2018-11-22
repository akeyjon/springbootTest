package callback;

public class Client implements MsCallback{

    private Server server;
    
    public Client(Server server){
        this.server = server;
    }
    
    @Override
    public void process(String msg) {
        // TODO Auto-generated method stub
        System.out.println("客户端： 服务端回调状态 " + msg);
    }
    
    public void sendMsg(String msg){
        System.out.println("客户端： 客户端发送的信息是 ：" +msg);
        new Thread(new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                server.getClientMsg(Client.this, msg);
            }
        }).start();
        System.out.println("客户端： 异步消息发送成功 ");
    }
    
}
