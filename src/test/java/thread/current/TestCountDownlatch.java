package thread.current;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class TestCountDownlatch {

    private static CountDownLatch cdl = new CountDownLatch(2);
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
        cdl.await();//让当前线程等待
        System.out.println("主++++++");
        
        
    }
    
    static class Thread1 implements Runnable{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            try {
                System.out.println("t1======");
                Thread.sleep(3000);
                cdl.countDown();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
    static class Thread2 implements Runnable{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            try {
                System.out.println("t2======");
                Thread.sleep(3000);
                cdl.countDown();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
}
