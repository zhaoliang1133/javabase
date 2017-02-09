package com.java.socket;

/**
 * Created by zhaoliang on 2016/11/14.
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 利用该类可以获取Ip地址、主机信息等！
InetAddress类的常用方法
getByName(String host)   返回InetAddres  获取主机相对应的主机对象
getHostAddress()         返回String      获取主机相对应的ip地址
getHostName()            返回string      获取主机相对应的主机名
getLocalHost()           返回InetAddress 返回本地主机的对象
*/
public class Address {                         //创建类
    public static void main(String[] args){
        InetAddress ip;                        //创建InetAddress对象
        try{                                   //使用try语句块捕捉异常
            ip=InetAddress.getLocalHost();     //实例化对象
            String localip=ip.getHostAddress();//获取本机ip地址
            String localname=ip.getHostName(); //获取本机名
            System.out.println("主机ip:"+localip+" - - "+"主机名："+localname);
        }
        catch (UnknownHostException e){
            e.printStackTrace();  //异常在主机不存在或网络连接错误时发生
        }
    }
}
