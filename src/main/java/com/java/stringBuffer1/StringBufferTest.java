package com.java.stringBuffer1;

/**
 * Created by zhaoliang on 2016/12/14.
 */

/**
StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）；
 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用StringBuilder 类；
 然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
 */

public class StringBufferTest {

    public static void main(String[] args){
        StringBuffer stringBuffer=new StringBuffer("aaa.");
        stringBuffer.append("bbb.");
        stringBuffer.append("ccc.");
        stringBuffer.append("ddd.");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder=new StringBuilder("aaa-");
        stringBuilder.append("bbb-");
        stringBuilder.append("ccc-");
        stringBuilder.append("ddd");
        System.out.println(stringBuilder);
        System.out.println( stringBuilder.capacity());
        System.out.println( stringBuilder.charAt(5));
    }

}
