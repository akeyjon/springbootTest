package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService e = Executors.newSingleThreadExecutor();
//        CaculateProccors c = new CaculateProccors();
        long currentTimeMillis = System.currentTimeMillis();
//        System.out.println("begin = "+System.currentTimeMillis());
        for(int i = 0; i<10; i++){
            CaculateProccors.add(e);
        }
        System.out.println("end ="+(System.currentTimeMillis() - currentTimeMillis));
        
    }
}
