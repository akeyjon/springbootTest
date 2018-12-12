package thread.current;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCycliBarrier2 {

        public static void main(String[] args) throws InterruptedException {
            CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {

                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    System.out.println("队伍够了，可以开始...");
                }
                
            });
            for(int i = 0; i<5; i++){
                Thread t = new Thread(new CyclicWorker(barrier));
                t.start();
                
            }
        }
        static class CyclicWorker implements Runnable {
            private CyclicBarrier barrier;
            public  CyclicWorker(CyclicBarrier barrier) {
                this.barrier = barrier;
            }
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i=0; i<3; i++){
                    System.out.println("excute");
                    try {
                        barrier.await();
                    } catch (InterruptedException | BrokenBarrierException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
            
        }
}

