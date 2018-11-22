package callback;

public class Server {

    public void getClientMsg(MsCallback mc, String msg){
        System.out.println("服务端： 服务端收到  msg =" +msg);
        try {
            System.out.println("开始处理业务。。。");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("服务端： 服务端业务处理成功。。。 返回状态码 200");
        mc.process("200");
    }
}
