package thread.volatiled;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Apple apple = new Apple();
        apple.setColor("yello");
        ThreadChangeApple1 ta1 = new ThreadChangeApple1();
        ThreadReadApple tra = new ThreadReadApple();
        ta1.setApple(apple);
        tra.setApple(apple);
        Thread t1 = new Thread(ta1);
        Thread t2 = new Thread(tra);
            
        t1.start();
        t2.start();
        Thread.sleep(2000);
        System.out.println(apple.getNum());
    }
}
