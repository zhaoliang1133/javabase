package com.java.enum1;

import static java.lang.System.out;

/**
 * Created by zhaoliang on 2016/11/16.
 */

/**
在枚举类型中，可以添加构造方法，但是规定这个构造方法必须为private修饰符所修饰
 */


public class EnumIndexTest {
    enum Constants2{             //将常量放置在枚举类型中
         CONSTANTS_A("我是A"),   //定义带参数的枚举类型成员
         CONSTANTS_B("我是B"),
         CONSTANTS_C("我是C"),
         CONSTANTS_D(3);
         private  String description;  //声明一个String类型的description
         private  int    i=4;          //声明一个int型的i赋初值为4

       private Constants2() {          //构造方法
        }

        private Constants2(int i) {    //定义参数为int型的构造方法
            this.i=this.i+i;
        }

       private Constants2(String description) {   //定义参数为String类型的方法
            this.description=description;
        }

        public String getDescription() {         //获取description的值
            return description;
        }

        public int getI() {    //获取i的值
            return i;
        }
    }

    public static void main(String[] args){
        for(int i=0;i<Constants2.values().length;i++){
            out.println(Constants2.values()[i]+"调用方法："+Constants2.values()[i].getDescription());
        }
        out.println(Constants2.valueOf("Constants_D")+"调用方法"+Constants2.valueOf("Constants_D").getI());
    }
}
