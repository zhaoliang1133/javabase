package com.java.reflect;

import java.lang.reflect.Constructor;

/**
 * Created by zhaoliang on 2016/11/16.
 */
public class Main_01 {
    public static void main(String[] args){
        Constructor[] declaredConstructors = Example_01.class.getDeclaredConstructors();
        for(int i=0;i<declaredConstructors.length;i++){
            Constructor constructor=declaredConstructors[i]; //遍历构造方法
            System.out.println("是否允许带有可变参数："+ constructor.isVarArgs());

            Class[] parameterTypes=constructor.getParameterTypes(); //返回构造方法的参数类型
            for(int j=0;j<parameterTypes.length;j++){
                System.out.print("   "+parameterTypes[j]);
            }
            Class[] exceptionTypes=constructor.getExceptionTypes();//获得所有可能抛出的异常信息类型
            for(int j=0;j<exceptionTypes.length;j++){
                System.out.println("   "+exceptionTypes[j]);
            }
            Example_01 example_02=null;
            while (example_02==null){
                try{
                   if(i==2){
                       example_02=(Example_01)constructor.newInstance(); //通过默认没有参数的构造方法创建对象
                   }else if(i==1){
                       example_02=(Example_01)constructor.newInstance("7",5);//通过执行两个参数的构造方法创建对象
                   }else {
                       Object[] parameters=new Object[]{new String[] {"100","200","300"}};//通过执行可变数量参数的构造方法创建对象
                       example_02=(Example_01) constructor.newInstance(parameters);
                   }
                }catch (Exception e){
                    constructor.setAccessible(true);   //设置为允许访问
                }
            }
            example_02.print();
            System.out.println();
        }
    }
}
