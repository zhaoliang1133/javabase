package com.java.reflect;

import java.lang.reflect.Field;

/**
 * Created by zhaoliang on 2016/11/16.
 */
public class Main_02 {
    public static void main(String[] args){
        Example_02 example_02=new Example_02();
        Class exampleC=example_02.getClass();
        Field[] declaredFields=exampleC.getDeclaredFields();//获得所有成员变量
        for(int i=0;i<declaredFields.length;i++){

            Field field=declaredFields[i];
            System.out.print(field.getName()+"   "); //获得成员变量名称

            Class fieldType=field.getType();
            System.out.println(fieldType); //获得成员变量的类型

            boolean isTum=true;
            while (isTum){
                //如果成员变量的访问权限为private,则抛出异常，即不允许访问
                try{
                    isTum=false;
                    System.out.println(field.get(example_02)); //获得成员变量值
                    if(fieldType.equals(int.class)){
                          field.setInt(example_02,168);        //为int型成员变量赋值
                     }else if(fieldType.equals(float.class)){
                          field.setFloat(example_02,99.9f);    //为float型成员变量赋值
                    }else if(fieldType.equals(boolean.class)){
                          field.setBoolean(example_02,true);   //为boolean型成员变量赋值
                    }else {
                        field.set(example_02,"MWQ");
                    }
                        System.out.println(field.get(example_02));
                }catch (Exception e){
                    field.setAccessible(true);  //设置为允许访问
                    isTum=true;
                }
            }
            System.out.println();
        }
    }
}
