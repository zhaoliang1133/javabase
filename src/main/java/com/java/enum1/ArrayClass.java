package com.java.enum1;

/**
 * Created by zhaoliang on 2016/11/16.
 */
public class ArrayClass<T> {
    private T[] array;  //定义泛型数组

    public T[] getArray() {   //获取成员数组
        return array;
    }

    public void setArray(T[] array) {    //为成员数组赋值
        this.array = array;
    }

    public static void main(String[] args){
        ArrayClass<String> a = new ArrayClass<String>();
        String[] array={"A 1","B 2","C 3","D 4"};
        a.setArray(array);
        for(int i=0;i<a.getArray().length;i++){
            System.out.println(a.getArray()[i]);
        }
    }
}
