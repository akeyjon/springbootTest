package thread.basic;

public class ThreadJoin {
   

  public static void main(String[] args) {
    
      Thread t1 = new Thread(new Runnable() {
        
        @Override
        public void run() {
            // TODO Auto-generated method stub
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("t1 结束");
        }
    });
      
      Thread t2 = new Thread(new Runnable() {
          
          @Override
          public void run() {
              // TODO Auto-generated method stub
            try {
                t1.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
              System.out.println("等待 t1 结束");
          }
      });
      
      t2.start();
      t1.start();
  }

    
}
