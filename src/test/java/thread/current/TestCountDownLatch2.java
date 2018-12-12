package thread.current;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCountDownLatch2 {

    volatile int count = 0;
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(10);
        ExecutorService caculate = Executors.newFixedThreadPool(1);
        
        
        
    }
    static class Run1 implements Runnable{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            
        }
        
        
    }
}
