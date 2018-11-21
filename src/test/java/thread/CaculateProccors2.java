package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CaculateProccors2 {

    //
    private static ExecutorService e = Executors.newSingleThreadExecutor();
    
    public static void add(){
       Future<?> submit = e.submit(new Thread(){
           public void run(){
               int a = 0;
               for(int i=0; i<5000; i++){
                   a= a+i;
               }
               System.out.println(a);
           }
       });
    }
    
}
