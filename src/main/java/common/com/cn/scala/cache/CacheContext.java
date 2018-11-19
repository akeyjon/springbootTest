package com.cn.scala.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class CacheContext<T> {

    private Map<Integer, T> cache = new ConcurrentHashMap<>();
    
    public T getCachefromid(int id){
        if(cache.containsKey(id)) return cache.get(id);
        return null;
    }
    
    public void setCache(int id, T value){
        cache.put(id, value);
    }
    
    public void removeCache(int id, T value){
        cache.remove(id, value);
    }
    
    public void reload(){
        cache.clear();
    }
}
