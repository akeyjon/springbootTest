package fast;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {
        Apple vf = Apple.valueOf();
//        Apple v2 = Apple.valueOf();
//        Apple a = new Apple();
//        System.out.println(vf == v2);
//        System.out.println(vf == a);
//        System.out.println(v2 == a);
        SDApple sda = new SDApple();
        Apple[] aps = new Apple[2];
        aps[0] = vf;
        aps[1] =sda;
        System.out.println(aps[0]+"==="+aps[1].getClass());
        List<Apple> list = new ArrayList<>();
        list.add(vf);
        list.add(sda);
        System.out.println(list.get(0)+"===="+list.get(1).getClass());
        
    }
}
