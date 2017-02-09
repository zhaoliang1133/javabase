package com.java.thread;

/**
 * Created by zhaoliang on 2016/11/14.
 */

/**
Thread类是java.lang包的一个类，这个类实例化的对象代表的线程。
public Thread(String threadName) 创建了一个名称为threadName线程对象
public Thread()
*/
public class ThreadTest extends Thread {
    private int count=10;
    public void run(){    //重写run方法
        while (true){
            System.out.print(count+" ");
            if(--count==0){
                return;
            }
        }
    }
    public static void main(String[] args){
        new ThreadTest().start();
    }
}
