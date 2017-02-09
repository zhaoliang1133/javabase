package com.java.enum1;

import static java.lang.System.out;

/**
 * Created by zhaoliang on 2016/11/16.
 */

/**
枚举类型可以取代以往常量的定义方式，即将常量封装在类或接口中
 枚举类型的特点：
    类型安全
    紧凑有效的数据定义
    可以和程序其他部分完美交互
    运行效率高
*/

public enum AnyEnum implements Constants2{

Constants_A{

    public String getDescription() {
        return ("我是枚举成员A");
    }

    public int getI() {
        return i;
    }
    },
    Constants_B{
        public String getDescription() {
            return ("我是枚举成员B");
        }

        public int getI() {
            return i;
        }
    },
    Constants_C{
        public String getDescription() {
            return ("我是枚举成员C");
        }

        public int getI() {
            return i;
        }
    },
    Constants_D{
        public String getDescription() {
            return ("我是枚举成员D");
        }

        public int getI() {
            return i;
        }
    };
    private static int i=5;
    public static void main(String[] args){
        for(int i=0;i<AnyEnum.values().length;i++){
            out.println(AnyEnum.values()[i]+"  "+AnyEnum.values()[i].getDescription());
            out.println(AnyEnum.values()[i]+"  "+AnyEnum.values()[i].getI());
        }
    }

}
