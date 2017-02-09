package com.java.enum1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoliang on 2016/11/16.
 */

/**
常用的泛型化的集合类
ArrayList<E>
HashMap<K,V>
HashSet<E>
Vector<E>
*/
public class MutiOverClass<K,V> {
    public Map<K,V> m = new HashMap<K, V>(); //定义一个集合HashMap实例

    public void put(K k,V v){ //设置put方法，将对应的键值与键名存入集合对象中
        m.put(k,v);
    }
    public V get(K k){   //根据键名获取键值
        return m.get(k);
    }

    public static void main(String[] args){
        MutiOverClass<Integer,String> mu=new MutiOverClass<Integer, String>(); //实例化泛型类对象
        for(int i=0;i<5;i++){
            mu.put(i,"我是"+i); //根据集合的长度循环将键名与具体值放入集合中
        }
        for(int i=0;i<mu.m.size();i++){
            System.out.println(mu.get(i)); //调用get方法获取集合中的值
        }
    }
}
