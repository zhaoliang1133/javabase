package com.java.enum1;

/**
 * Created by zhaoliang on 2016/11/16.
 */

/**
向上转型与向下转型回顾
*/
public class Test {
    private Object b;    //定义object类型变量
    public Object getB() {  //设置响应的get方法
        return b;
    }
    public void setB(Object b) {  //设置响应的set方法
        this.b = b;
    }
    public static void main(String[] args){
        Test test=new Test();
        test.setB(new Boolean(true));//向上转型操作
        System.out.println(test.getB());
        test.setB(new Float(12.4));
        Float f=(Float) (test.getB());//向下转型
        System.out.println(f);
    }
}
