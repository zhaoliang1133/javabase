package com.java.thread;

/**
 * Created by zhaoliang on 2016/11/15.
 */

/**
线程安全问题来源两个线程同时存取单一对象的数据

 10 7 8 9 6 5 4 3 2 1 0 -1 -2  线程都对num变量进行了递减操作。从而产生了负值
*/
public class ThreadSafeTest implements Runnable {
    int num=10;
    public void run() {
        while (true){
            if(num>0){
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(num--);
            }
        }
    }
    public static void main(String[] args){
        ThreadSafeTest t = new ThreadSafeTest();
        Thread tA=new Thread(t);
        Thread tB=new Thread(t);
        Thread tC=new Thread(t);
        Thread tD=new Thread(t);
        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
