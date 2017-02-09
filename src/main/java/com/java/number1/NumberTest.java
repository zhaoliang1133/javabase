package com.java.number1;

/**
 * Created by zhaoliang on 2016/12/14.
 */
/**
java Number类
 包装类：Integer Long Byte Double Float Short
 这种由编译器特别支持的包装称为装箱，所以当内置数
 据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。
 相似的，编译器也可以把一个对象拆箱为内置类型。Number 类属于 java.lang 包。
*/

public class NumberTest {
    public static void main(String[] args){
        Integer x=5; //装箱，当x被赋为整型值时，由于x是一个对象，所以编译器要对x进行装箱
        x=x+10;  //拆箱，为了使x能进行加运算，所以要对x进行拆箱。
        System.out.println(x);
    }
}
