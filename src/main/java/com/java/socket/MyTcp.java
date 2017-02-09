package com.java.socket;

/**
 * Created by zhaoliang on 2016/11/14.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 TCP 可以保证从一端数据送至连接的另一端，数据能准确送达。
 主要功能是等待来自网络上的“请求”，它可以通过指定的端口来等待连接的套接字。
ServerSocket的常用方法
accept()                       Socket       等待客户机连接，若连接，则创建一套接字
isBound()                      boolean      判断serverSocket的绑定状态
getInetAddress()               InetAddress  返回此服务器套接字的本地地址
isClosed()                     boolean      返回服务器套接字的关闭状态
close()                        void         关闭服务器套接字
bind(SocketAddress endpoint)   void         将serverSocket绑定到特定地址
*/
public class MyTcp {
    private BufferedReader reader; //创建BufferedReader对象
    private ServerSocket server;   //创建ServerSocket对象
    private Socket  socket;        //创建Socked对象
    void getserver(){
        try{
            server=new ServerSocket(8998);  //实例化Socket对象
            System.out.println("服务器套接字创建成功！");
            while (true){                   //如果套接字是连接状态
                System.out.println("等待客户连接！");
                socket=server.accept();     //实例化Socket对象
                reader=new BufferedReader(new InputStreamReader(socket.getInputStream())); //实例化BufferedReader对象
                getClientMessage();           //调用getClientMessage()方法
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void getClientMessage(){
        try{
            while (true){                 //如果套接字是连接状态
                System.out.println("客户机:"+reader.readLine()); //获得客户端信息
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            if(reader!=null){
                reader.close();  //关闭流
            }
            if(socket!=null){
                socket.close();  //关闭套接字
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        MyTcp tcp=new MyTcp();   //创建本类对象
        tcp.getserver();         //调用方法
    }
}
