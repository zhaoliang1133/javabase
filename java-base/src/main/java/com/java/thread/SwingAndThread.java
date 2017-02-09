package com.java.thread;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by zhaoliang on 2016/11/14.
 */

/**
Runnable接口的程序会创建一个Thread对象
public Thread(Runnable r)  可以将Runnable实例与Thread实例相关联
public Thread(Runnable r,String name)  可以将Runnable实例与Thread实例相关联
建立Runnable对象
使用参数为Runnable对象的构造方法创建Thread实例
调用start()方法启动线程
*/
public class SwingAndThread extends JFrame {
    private JLabel jl=new JLabel();
    private  static  Thread t;
    private int count=0;
    private Container container=getContentPane();
    public SwingAndThread(){
        setBounds(300,200,250,100);
        container.setLayout(null);
        URL url=SwingAndThread.class.getResource("");//获取图片资源
        Icon icon=new ImageIcon(url);
        jl.setIcon(icon);
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setBounds(10,10,200,50);
        jl.setOpaque(true);
        t=new Thread(new Runnable() { //定义匿名内部类，该类实现Runnable接口
            public void run() {  //重写run()方法
                while (count<=200){
                    jl.setBounds(count,10,200,50);
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    count+=4;
                    if(count==200){
                        count=10;
                    }
                }
            }
        });
        t.start();
        container.add(jl);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args){
        new SwingAndThread();
    }
}
