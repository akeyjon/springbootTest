package activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class AppConsumer {

    private static final String URL = "tcp://127.0.0.1:61616";
    private static final String queueName= "queue-test";
    public static void main(String[] args) throws JMSException {
        
        //创建连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(URL);
        
        //创建连接
        Connection connection = connectionFactory.createConnection();
        
        //启动连接
        connection.start();
        
        //创建会话
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        
        //创建一个目标
        Destination destination = session.createQueue(queueName);
        
        //创建一个消费者
        MessageConsumer consumer = session.createConsumer(destination);
        
        //创建一个监听器
        consumer.setMessageListener(new MessageListener() {
            
            @Override
            public void onMessage(Message message) {
                // TODO Auto-generated method stub
                TextMessage textMessage = (TextMessage) message;
                try {
                    System.out.println("接收到的消息是"+textMessage.getText());
                } catch (JMSException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        
//        for(int i=0; i<100;i++){
//            //创建消息
//            TextMessage message = session.createTextMessage("test" +i);
//            
//            //发布消息
//            producer.send(message);
//            
//            System.out.println("发布了一个消息"+message.getText());
//        }
        
        //关闭连接
//        connection.close();
    }
}
