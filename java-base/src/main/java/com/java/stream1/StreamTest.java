package com.java.stream1;

/**
 * Created by zhaoliang on 2016/12/15.
 */

import java.io.*;

/**
Java.io 包,
 几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。
 Java.io 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。
 一个流可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。
 Java 为 I/O 提供了强大的而灵活的支持，使其更广泛地应用到文件传输和网络编程中。

 读写文件
 FileInputStream
 该流用于从文件读取数据，它的对象可以用关键字 new 来创建。
 有多种构造方法可用来创建对象。
 FileOutputStream
 该类用来创建一个文件并向文件中写数据。
 如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件。

 文件和io
 File类中有两个方法可以用来创建文件夹
 mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。
 失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
 mkdirs()方法创建一个文件夹和它的所有父文件夹。
*/

public class StreamTest {

    public static void mkdirFile() throws FileNotFoundException {
        String name="D:\\AAA\\bb\\cc\\test.txt";
        File file=new File(name);
        file.mkdirs();
    }

    public static void buffer() throws IOException {
        char c;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        do {
            c=(char)bufferedReader.read();
        }while (c!='q');
    }

    public static void file(){
        try{
            byte bWrite [] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x=0; x < bWrite.length ; x++){
                os.write( bWrite[x] ); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i=0; i< size; i++){
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        }catch(IOException e){
            System.out.print("Exception");
        }
    }
    public static void main(String[] args) throws IOException {
        buffer();
        file();
        mkdirFile();
    }
}
