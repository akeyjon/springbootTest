package thread.current;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCycliBarrier3 {

    public static void main(String[] args) {
        CyclicBarrier clb = new CyclicBarrier(1);
        for(int i=0; i<10; i++){
            Thread old = new Thread(new Run2(clb, i));
            Thread lis = new Thread(new Run1(clb, i));
            old.start();
            lis.start();
        }
        
    }
    static class Run1 implements Runnable{
        private CyclicBarrier cyclicBarrier;
        private int i;
        
        public Run1(CyclicBarrier cyclicBarrier, int i){
            this.cyclicBarrier = cyclicBarrier;
            this.i = i;
        }
        
        @Override
        public void run() {
            // TODO Auto-generated method stub
            try {
                        System.out.println(i);
                        cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        
    }
    static class Run2 implements Runnable{
        private CyclicBarrier cyclicBarrier;
        private int i;
        public Run2(CyclicBarrier cyclicBarrier, int i){
            this.cyclicBarrier = cyclicBarrier;
            this.i = i;
        }
        
        @Override
        public void run() {
            // TODO Auto-generated method stub
            try {
                        System.out.println(i);
                        cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        
    }
}
