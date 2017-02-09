package com.java.socket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * Created by zhaoliang on 2016/11/14.
 */
public class Receive extends JFrame implements Runnable,ActionListener {

    int port;
    InetAddress group=null;
    MulticastSocket socket=null;
    JButton ince=new JButton("开始接收");
    JButton stop=new JButton("停止接收");
    JTextArea inceAr=new JTextArea(10,10);
    JTextArea inced= new JTextArea(10,10);
    Thread thread;
    boolean b=false;
    public Receive(){
        super("广播数据报");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thread = new Thread(this);
        ince.addActionListener(this);
        stop.addActionListener(this);
        inceAr.setForeground(Color.blue);
        JPanel north=new JPanel();
        north.add(ince);
        north.add(stop);
        add(north,BorderLayout.NORTH);
        JPanel center=new JPanel();
        center.setLayout(new GridLayout(1,2));
        center.add(inceAr);
        center.add(inced);
        add(center,BorderLayout.CENTER);
        validate();
        port=9898;
        try{
            group=InetAddress.getByName("224.255.10.0");
            socket=new MulticastSocket(port);
            socket.joinGroup(group);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        setBounds(100,50,360,380);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ince){
            ince.setBackground(Color.red);
            stop.setBackground(Color.yellow);
            if(!thread.isAlive()){
                thread = new Thread(this);
            }
            thread.start();
            b=false;
        }
        if(e.getSource()==stop){
            ince.setBackground(Color.yellow);
            stop.setBackground(Color.red);
            b=true;
        }
    }

    public void run() {
        while (true){
            byte data[] = new byte[1024];
            DatagramPacket packet=null;
            packet=new DatagramPacket(data,data.length,group,port);
            try{
                socket.receive(packet);
                String message=new String(packet.getData(),0,packet.getLength());
                inceAr.setText("正在接收的内容"+message);
                inced.append(message);
            }catch (Exception e){
                e.printStackTrace();
            }
            if(b==true){
                break;
            }
        }
    }
    public static void main(String[] args){
        Receive rec=new Receive();
        rec.setSize(460,200);
    }
}
