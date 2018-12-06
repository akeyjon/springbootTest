package thread.current;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {

    private static CyclicBarrier clb = new CyclicBarrier(2, new Thread3());
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
        clb.await();
        System.out.println("主++++++");
        
        
    }
    
    static class Thread1 implements Runnable{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            try {
                Thread.sleep(3000);
                clb.await();
                System.out.println("t1======");
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
                Thread.sleep(3000);
                clb.await();
                System.out.println("t2======");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
    static class Thread3 implements Runnable{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            try {
                System.out.println("优先执行======");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
    
}
