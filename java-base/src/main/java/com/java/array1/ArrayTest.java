package com.java.array1;

/**
 * Created by zhaoliang on 2016/12/15.
 */
/**
数组变量的声明，和创建数组可以用一条语句完成
 dataType[] arrayRefVar = new dataType[arraySize];
 dataType[] arrayRefVar = {value0, value1, ..., valuek};
 数组的元素是通过索引访问的。数组索引从 0 开始，所以索引值从 0 到 arrayRefVar.length-1。
 type arrayName = new typ[arraylenght1][arraylenght2];
*/

public class ArrayTest {
    public static void arrayTest(){
        double[] a=new double[3];
        a[0]=1.11;
        a[1]=1.22;
        a[2]=1.33;
        double sum=0;
        double max=a[0];
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(a[i]>=max){
                max=a[i];
            }
        }
        System.out.println("方法1："+sum+"  最大值："+max);

        for(double m:a){
            sum=sum+m;
            if(m>=max){
                max=m;
            }
        }
        System.out.println("方法1+1："+sum+"  最大值："+max);

    }
    public static void arrayTest1(){
        double[] a={1.11,1.22,1.33};
        double sum=0;
        double min=a[0];
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(a[i]<=min){
                min=a[i];
            }
        }
        System.out.println("方法2："+sum+"  最小值："+min);
    }
    public static void main(String args[]){
        arrayTest();
        arrayTest1();
    }
}
