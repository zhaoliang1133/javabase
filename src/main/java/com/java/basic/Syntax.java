package com.java.basic;

/**
 * Created by zhaoliang on 2016/12/14.
 */

/**
java基本语法如下：
对象：对象是类的一个实例，有状态和行为；
类：类是一个模板，描述一类对象的行为和状态；
方法：方法就是行为，一个类可以有很多方法；
实例变量：每个对象都有独特的实例变量，对象的状态由这些实例变量的值决定。
 大小写敏感
 类名：首字母大写
 方法名：以小写字母开头

 java修饰符：
 主要有两类修饰符
 访问控制修饰符：default public private protected
 非访问控制修饰符：final abstract strictfp(浮点数比较使用严格的规则)
 default 在同一包内可见，不使用任何修饰符
 public  对所有类可见
 private  修饰符指定，同一类内可用
 protected 同一包内的类和所有子类可见


java枚举：
 java5.0引入了枚举，枚举限制变量只能是预先设置好的值，使用枚举可以减少代码中的bug
 枚举可以单独声明或者声明在类里面。方法、变量、构造函数也可以在枚举中定义
 final  表示一个值在初始化之后就不能再改变了  表示方法不能被重写，或者一个类不能有子类
 synchronized	表示同一时间只能由一个线程访问的代码块
 transient	修饰不要序列化的字段
 volatile	标记字段可能会被多个线程同时访问，而不做同步
 instanceof	测试一个对象是否是某个类的实例

 java继承：
 一个类可以有其他类派生，如果你要创建一个类，而且已经存在一个类具有你所需要的属性和方法，那么你新创建的类可以继承该类，
 利用继承，可以重用已存在类的方法和属性，而不用重写这些代码，被集成的类称为超类，派生类称为子类。

 java接口：
 接口可以理解为对象间相互通信的协议
 接口只定义派生要用到的方法，但是方法的具体实现完全取决于派生类。

 java面向对象：
 多态
 继承
 封装
 抽象
 类 ，是一个模板，他描述一类对象的状态和行为。
 对象，是类的一个实例，有状态和行为。
 实例
 方法
 重载
*/
public class Syntax {
    public Syntax() {
    }

    public Syntax(String name) {
        this.name = name;
    }

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String args[]){
        Syntax syntax=new Syntax("zhangsan");
        System.out.println(syntax.name);
        syntax.setAge("11");
        syntax.setName("李四");
        System.out.println(syntax.getName()+syntax.getAge());
    }

}
