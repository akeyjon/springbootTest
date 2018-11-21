package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CaculateProccors {

    public static void add(ExecutorService e) throws InterruptedException{
       Future<?> submit = e.submit(new Thread(){
           public void run(){
               int a = 0;
               for(int i=0; i<90; i++){
                   a= a+i;
               }
//               System.out.println(a);
           }
       });
    }
    
}
