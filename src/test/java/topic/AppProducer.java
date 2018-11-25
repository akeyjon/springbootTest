package topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class AppProducer {
    
    private static final String URL = "tcp://127.0.0.1:61616";
    private static final String topicName= "topic-test";
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
        Destination destination = session.createTopic(topicName);
        
        //创建一个生产者
        MessageProducer producer = session.createProducer(destination);
        
        for(int i=0; i<100;i++){
            //创建消息
            TextMessage message = session.createTextMessage("test" +i);
            
            //发布消息
            producer.send(message);
            
            System.out.println("发布了一个消息"+message.getText());
        }
        
        //关闭连接
        connection.close();
    }
}
