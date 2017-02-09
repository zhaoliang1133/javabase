package com.java.method;

/**
 * Created by zhaoliang on 2016/12/15.
 */
/**
修饰符 返回值类型 方法名(参数类型 参数名){
        ...
        方法体
        ...
        return 返回值;
        }
 修饰符：修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。
 返回值类型 ：方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行
 所需的操作，但没有返回值。在这种情况下，returnValueType 是关键字void。
 方法名：是方法的实际名称。方法名和参数表共同构成方法签名。
 参数类型：参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。
 参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。
 方法体：方法体包含具体的语句，定义该方法的功能。
 */
public class MethodTest {
    public static int max(int a,int b){
     int result;
        if(a>b){
            result=a;
        }
        else {
            result=b;
        }
        return result;
    }
    public static void main(String[] args){
   System.out.println(max(3,2));
    }

}
