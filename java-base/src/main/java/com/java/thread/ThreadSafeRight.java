package com.java.thread;

/**
 * Created by zhaoliang on 2016/11/15.
 */

/**
打印到最后票数没有出现负数，这是因为将资源放置在了同步块中，这个同步块被称为临界区，通过synchronized关键字建立
通常将共享资源放置在synchronized定义区域，这样其他线程也获得到这个锁时，必须等待锁被释放时才能进入该区域
 */
public class ThreadSafeRight implements Runnable {

    int num=10;
    public void run() {
        while (true){
            synchronized (""){
                if(num>0){
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(--num);
                }
            }
        }
    }
    public static void main(String[] args){
        ThreadSafeRight t=new ThreadSafeRight();
        Thread threadA=new Thread(t);
        Thread threadB=new Thread(t);
        Thread threadC=new Thread(t);
        Thread threadD=new Thread(t);
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
