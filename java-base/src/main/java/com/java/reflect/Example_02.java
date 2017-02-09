package com.java.reflect;

/**
 * Created by zhaoliang on 2016/11/16.
 */

/**
访问成员变量
 通过下列方法访问成员变量时，将返回Field类型的对象或数组。每个Field对象代表一个成员变量。
 getFields()      获得所有权限为public的成员变量
 getField(String name)   获得权限为public的指定成员变量
 getDeclaredFields()     获得所有成员变量，按声明顺序返回
 getDeclareField(String name)  获得指定成员变量
 Field类的常用方法
 getName()  获得成员变量的名称
 getType()  获得成员变量类型的class对象
 setAccessible(boolean flag)  是否忽权限限制直接访问private等私有权限的变量
 getModifiers() 获得可以解析出该成员变量所采用修饰符的整数
*/
public class Example_02 {
    int i;
    public float f;
    protected  boolean b;
    private String s;
}
