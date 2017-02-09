package com.java.enum1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * Created by zhaoliang on 2016/11/16.
 */

/**
泛型的高级用法
 限制泛型可用类型  class 类名称<T extends anyClass>
 使用类型通配符  泛型类型名称<? extends List> a=null; 表示类型为知，可以单独实例化
 继承泛型类与实现泛型接口 class SubClass<T1,T2,T3> extends ExtendClass<T1>

 泛型的使用方法
 泛型的类型参数只能是类类型，不可以是简单类型
 泛型的类型个数可以是多个
 可以使用extends关键字限制泛型的类型
 可以使用通配符限制泛型的类型
 */
public class AnyClass {
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<Integer>(); //定义ArrayList容器，设置容器内的值类型为Integer
        a.add(1);      //为容器添加值
        a.add(2);
        for(int i=0;i<a.size();i++){ //根据容器的长度循环显示容器内的值
            System.out.println(a.get(i));
        }

        Map<Integer,String> m=new HashMap<Integer, String>(); //定义hashMap容器，设置容器的键名与键值类型分别为Integer与String型
        for(int i=0;i<5;i++){
            m.put(i,"成员"+i); //为容器填充键名与键值
        }
        for(int i=0;i<m.size();i++){
            System.out.println(m.get(i)); //根据键名获取键值
        }

        Vector<String> v=new Vector<String>(); //定义容器为Vector,使容器中的内容为String型
        for(int i=0;i<5;i++){
            v.addElement(" "+i); //为Vector容器添加内容
        }
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));  //显示容器的内容
        }
    }
}
