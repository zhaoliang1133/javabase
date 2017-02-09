package com.java.enum1;

/**
 * Created by zhaoliang on 2016/11/16.
 */

/**
Object类为最上层的父类，设计程序时通常传入的值与返回的值都以Object类型为主
 类名<T>
 T代表一个类型的名称
 */
public class OverClass<T> {
    private T over;

    public T getOver() {
        return over;
    }

    public void setOver(T over) {
        this.over = over;
    }
    public static void main(String[] args){
        OverClass<Boolean> overClass1=new OverClass<Boolean>();
        OverClass<Float> overClass2=new OverClass<Float>();
        overClass1.setOver(true);
        overClass2.setOver(12.3f);
        System.out.println(overClass1.getOver());
        System.out.println(overClass2.getOver());
    }

}
