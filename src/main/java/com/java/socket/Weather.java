package com.java.socket;

/**
 * Created by zhaoliang on 2016/11/14.
 */

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
UDP的信息传递更快，但不提供可靠的保证
DatagramPacket类 用来表示数据包
DatagramPacket(byte[] buf,int length) 指定了数据包的内存空间和大小。
DatagramPacket(byte[] buf,int length.InteAddress address,int port) 不仅指定数据包的内存空间和大小，还制定了数据包的目标地址和端口。
 DatagramSocket类 用于表示发送和接收数据包的套接字。
DatagramSocket()  构造数据报套接字并将其绑定到本地主机上的指定端口。
DatagramSocket(int port) 创建数据报套接字，并将其绑定到本地主机上的指定端口
DatagramSocket(int port,InetAddress addr) 创建数据报套接字，并将其绑定到指定的本地地址。
 */
public class Weather extends Thread {  //多线程程序
    String  weather="节目预报：八点大型晚会，请收听";
    int port=9898;
    InetAddress iaddress=null;
    MulticastSocket socket=null;
    Weather(){
        try{
            iaddress = InetAddress.getByName("224.255.10.0");
            socket=new MulticastSocket(port);
            socket.setTimeToLive(1);
            socket.joinGroup(iaddress);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
        while (true){
            DatagramPacket packet=null;
            byte data[]=weather.getBytes();
            packet=new DatagramPacket(data,data.length,iaddress,port);
            System.out.println(new String(data));
            try{
                socket.send(packet);
                sleep(3000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
public static void main(String[] args){
    Weather w=new Weather();
    w.start();
}

}
