package thread.basic;

public class TestWaitNotify {

    static boolean flag = true;
    static Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        
        Thread t1 = new Thread(new WaitClass());
        Thread t2 = new Thread(new NotifyClass());
        t1.start();
        Thread.sleep(1000);
        t2.start();
        
        
    }
    static class WaitClass implements Runnable{
        
        @Override
        public void run() {
            synchronized (lock) {
                while(flag){
                    System.out.println("条件不满足，继续等待=========="+ System.currentTimeMillis());
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println("条件满足， 开始执行 任务。。。。======="+ System.currentTimeMillis());
            }
        }
        
    }
    
    static class NotifyClass implements Runnable{
        
        @Override
        public void run() {
            // TODO Auto-generated method stub
            synchronized (lock) {
                System.out.println("获取到锁 ，开始通知。。。=========="+ System.currentTimeMillis());
                flag = false;
                lock.notifyAll();
            }
            
            synchronized (lock) {
                System.out.println("再次获取到锁：======="+ System.currentTimeMillis());
            }
        }
        
    }
}
