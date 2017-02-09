package com.java.thread;

/**
 * Created by zhaoliang on 2016/11/15.
 */


import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 线程具有生命周期，有7种状态：
        出生状态、就绪状态、运行状态、等待状态、休眠状态、阻塞状态、死亡状态
就绪状态的方法：
        调用sleep方法
        调用wait方法
        等待输入/输出完成
就绪进入运行状态的方法：
        线程调用notify()方法
        线程调用notifyAll()方法
        线程调用interrupt()方法
        线程的休眠时间结束
        输入/输出结束
 */

public class SleepMethodTest extends JFrame {
    private Thread t; //创建Thread对象
    private static Color[] color={Color.CYAN,Color.GREEN,Color.BLUE,Color.black,Color.orange,Color.yellow,Color.RED,Color.PINK,Color.LIGHT_GRAY};//定义颜色数组
    private static final Random rand=new Random();//创建随机数
    private  static Color getC(){
        return color[rand.nextInt(color.length)];
    }
    public SleepMethodTest(){
        t=new Thread(new Runnable() { //创建匿名线程对象
            int x=30;
            int y=50;
            public void run() {
                while(true){
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    //获取组件绘图上下文对象
                    Graphics graphics=getGraphics();
                    graphics.setColor(getC());   //设置绘图颜色
                    graphics.drawLine(x,y,100,y++);
                    if(y>=80){
                        y=50;
                    }
                }
            }
        });
        t.start();
    }
    public static void main(String[] args){
        init(new SleepMethodTest(),100,100);
    }
    public static void init(JFrame frame,int width,int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
