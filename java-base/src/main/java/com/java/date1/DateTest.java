package com.java.date1;

/**
 * Created by zhaoliang on 2016/12/15.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
java.util 包提供了 Date 类来封装当前的日期和时间。 Date 类提供两个构造函数来实例化 Date 对象
new Date()的时候，才会变成新的时间。
 */
public class DateTest {
    public static void test() throws InterruptedException {
    long start=System.currentTimeMillis();
        System.out.println(new Date());
        Thread.sleep(10*20*30);
        System.out.println(new Date());
        long end=System.currentTimeMillis();
        long time=end-start;
        System.out.println(time);
    }
    public static void main(String[] args) throws InterruptedException {
        Date date=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy.MM.dd hh:mm:ss E");
        System.out.println(s.format(date));
        System.out.println(date.toString());
        test();
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
