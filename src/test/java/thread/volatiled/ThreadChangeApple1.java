package thread.volatiled;

public class ThreadChangeApple1 implements Runnable{

    private  Apple apple;
    
    
    @Override
    public void run() {
        int num;
        for(int i=0; i<11 ; i++){
            
             num = apple.getNum();
             num++;
             apple.setNum(num);
        }
    }


    public Apple getApple() {
        return apple;
    }


    public void setApple(Apple apple) {
        this.apple = apple;
    }
    
    

}
