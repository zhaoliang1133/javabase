package com.java.reflect;

import java.lang.reflect.Method;

/**
 * Created by zhaoliang on 2016/11/16.
 */
public class Main_03 {
    public static void main(String[] args){
        Example_03 example_03=new Example_03();
        Method[] declareMethods=example_03.getClass().getDeclaredMethods();//获得所有方法
        for(int i=0;i<declareMethods.length;i++){
            Method method=declareMethods[i];  //遍历方法
            System.out.print(method.getName()+"   ");  //获得方法名称
            System.out.println(method.isVarArgs());  //获得是否可变参数
        }
    }
}
