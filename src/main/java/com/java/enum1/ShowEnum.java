package com.java.enum1;

/**
 * Created by zhaoliang on 2016/11/15.
 */

import static java.lang.System.out;

/**
枚举类型的常用方法
values() 该方法可以将枚举类型成员以数组的形式返回
valueOf() 该方法可以将普通字符串转换为枚举实例
compareTo() 该方法比较两个枚举对象在定义时的顺序
ordinal() 该方法用于得到枚举成员的位置索引
*/
public class ShowEnum {
    enum Constants2{  //将常量放置在枚举类型中
        CONSTANTS_A,
        CONSTANTS_B,
        CONSTANTS_C
    }
    public static void main(String[] args){
       //constantsValues();
        //compare(Constants2.valueOf("CONSTANTS_B"));
        constantsOrdinal();
    }
    public static void constantsValues(){
        for(int i=0;i<Constants2.values().length;i++){  //循环有values方法返回数组
            out.println(Constants2.values()[i]);//将枚举成员变量打印
        }
    }
    public static void compare(Constants2 c){
        for(int i=0;i<Constants2.values().length;i++){
            out.println(c+"与"+Constants2.values()[i]+"结果为："+c.compareTo(Constants2.values()[i]));
           /* 结果为：
            CONSTANTS_B与CONSTANTS_A结果为：1 正直代表方法中参数在调用该方法的枚举对象位置之前
            CONSTANTS_B与CONSTANTS_B结果为：0 代表枚举位置相同，负数代表之后
            */
        }
    }
    public static void constantsOrdinal(){
        for(int i=0;i<Constants2.values().length;i++){
            out.println(Constants2.values()[i]+"索引值"+Constants2.values()[i].ordinal());
        }
    }
}
