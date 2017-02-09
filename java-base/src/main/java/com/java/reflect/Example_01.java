package com.java.reflect;

/**
 * Created by zhaoliang on 2016/11/16.
 */

/**
通过java的反射机制，可以更深入的控制程序的运行过程
 构造方法： getConstructors() 获取所有权限为public的构造方法
            getConstructors(Class<?>...parameterTypes)   获取权限为public的指定方法
            getDeclaredConstructors() 获得所有构造方法，按声明顺序返回
            getDeclaredConstructors(Class<?>...parameterTypes) 获得指定构造方法
 Constructor类的常用方法：
   isVarArgs() 查看构造方法是否允许带有可变数量的参数，如果允许放回true，否则返回false
   getParameterTypes() 获得该构造方法的各个参数的类型
   getExceptionTypes() 获得该构造方法可能抛出的异常类型
   newInstance(Object...initargs) 利用指定参数创建一个该类的对象
   setAccessible(boolean flag) 先执行该方法，入口设为true.则允许通过反射利用newInstance()方法创建。
   getModifiers 获得可以解析出该构造方法所采用修饰符的整数
*/
public class Example_01 {
    String s;
    int i,i2,i3;

    private Example_01() {
    }

    protected Example_01(String s, int i) {
        this.s = s;
        this.i = i;
    }

    public Example_01(String...strings)throws NumberFormatException {
        if(0<strings.length){
            i=Integer.valueOf(strings[0]);
        }
        if(1<strings.length){
            i2=Integer.valueOf(strings[1]);
        }
        if(2<strings.length){
            i3=Integer.valueOf(strings[2]);
        }
    }
    public void print(){
        System.out.println(s);
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
    }
}
