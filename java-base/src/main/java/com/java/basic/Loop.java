package com.java.basic;

/**
 * Created by zhaoliang on 2016/12/14.
 */
public class Loop {
    public void loopWhile(int x){
        while (x<10){
            System.out.print(x+" ");
            x++;
        }
    }
    public void loopDoWhile(int x){
        do{
            System.out.print(x+"-");
            x++;
        }
        while (x<10);
    }
    public void loopFor(int x){
        for( ;x<10;x++){
            System.out.print(x+" ");
        }
    }
    public void loopFor1(int[] a){
        for(int data:a){
            if(data==3)
            {
                break;
            }
            System.out.print(data);
        }
    }
    public static void main(String[] args){
        Loop loop=new Loop();
        loop.loopWhile(1);
        loop.loopDoWhile(2);
        loop.loopFor(2);
        int[] a={1,2,3,4,5};
        loop.loopFor1(a);
    }
}
