package com.java.thread;

/**
 * Created by zhaoliang on 2016/11/15.
 */

/**
 线程的中断
 提倡用run()方法使用无线循环的形式，然后使用布尔值控制循环的结束

 线程的优先级
 可以使用setPriority()方法调整，设置优先级，抛出的异常时InneaglArgumentException
*/
public class InterruptedTest implements Runnable{
    private boolean isContinue=false;
    public void run() {
        while (true){
            if(isContinue){
                break;
            }
        }
    }
    public void setContinue(){
        this.isContinue=true;
    }
}
