package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>(16, 0.75F, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> oldlist){
                return size() > 3;
            }

        };
        
        lhm.put("name1", "tom");
        lhm.put("name2", "jerry");
        lhm.put("name3", "rose");
        lhm.forEach((k, v) -> {
            System.out.println(k+":"+v);
        });
        
        //模拟访问
        lhm.get("name1");
        lhm.get("name1");
        lhm.get("name3");
        
        //出发删除
        System.out.println("开始删除 name2:jerry");
        lhm.put("name4", "marry");
        lhm.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
        
        System.out.println("删除完毕");
        
    }
}
