package com.java.thread;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zhaoliang on 2016/11/15.
 */

/**
线程的加入
join()方法
*/
public class JoinTest extends JFrame {
    private Thread threadA;
    private Thread threadB;//定义两个线程
    final JProgressBar progressBar = new JProgressBar();
    final JProgressBar progressBar2=new JProgressBar();//定义两个进度条组件
    int count=0;
    public static void main(String[] args){
     init(new JoinTest(),100,100);
    }
    public JoinTest() {
        super();
        getContentPane().add(progressBar, BorderLayout.NORTH); //将进度条设置在窗体的最北面
        getContentPane().add(progressBar2,BorderLayout.SOUTH); //将进度条设置在窗体的最南面
        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);//设置进度条显示数字字符
        threadA=new Thread(new Runnable() { //使用匿名内部类形式初始化Thread实例
            int count=0;
            public void run() {//重写run方法
                while (true){
                    progressBar.setValue(++count);
                    try{
                        Thread.sleep(100);
                        threadB.join();  //使线程B调用join()方法
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

            }
        });
        threadA.start();
        threadB=new Thread(new Runnable() {
            int count=0;
            public void run() {
                while (true){
                    progressBar2.setValue(++count);
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    if(count==100)
                        break;
                }
            }
        });
        threadB.start();
    }
    public static void init(JFrame frame,int width,int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setVisible(true);
    }
}
