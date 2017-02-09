package com.java.reflect;

/**
 * Created by zhaoliang on 2016/11/16.
 */

/**
访问方法
 通过下列一组方法访问方法时，将返回Method类型的对象或数组。
  getMethods()                                             获得所有权限为public的方法
  getMethod(String name,Class<?>...parameterTypes)         获得所有权限为public的指定方法
  getDeclaredMethods()                                     获得所有方法，按声明顺序返回
  getDeclaredMethod(String name,Class<?>...parameterTypes) 获得指定方法

 Method类的常用方法
 getName() 获得该方法的名称
 getParameterTypes() 返回该方法的各个参数类型
 getReturnType() 以class对象的形式获得该方法的返回值的类型
 getExceptionType() 以class数组的形式获得该方法可能抛出的异常类型
 invoke(Object obj,Object...args) 指定对象obj中的方法，返回值为Object型
 isVarArgs() 查看是否允许带可变数量的参数，如果允许则返回true,否则返回false
 getModifiers() 获得可以解析出该方法所采用修饰的整数
 */
public class Example_03 {
    static void staticMethod(){
        System.out.println("执行Method的方法");
    }
    public int publicMethod(int i){
        System.out.println("执行publicMethod方法");
        return i*100;
    }
    protected int protectedMethod(String s,int i)throws NumberFormatException{
         System.out.println("执行protectedMethod方法");
         return Integer.valueOf(s)+i;
    }
    private String privateMethod(String...strings){
        System.out.println("执行privateMethod方法");
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<strings.length;i++){
            stringBuffer.append(strings[i]);
        }
        return stringBuffer.toString();
    }
}
