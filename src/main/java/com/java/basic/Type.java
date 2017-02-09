package com.java.basic;

/**
 * Created by zhaoliang on 2016/12/14.
 */
/**
java基本数据类型：
java的两大数据类型 内置数据类型 引用数据类型
内置数据类型(8种基本基本类型)
 byte int short long float double char boolean
引用类型
 在Java中，引用类型的变量非常类似于C/C++的指针。
 引用类型指向一个对象，指向对象的变量是引用变量。
 这些变量在声明时被指定为一个特定的类型，比如Employee、Pubby等。变量一旦声明后，类型就不能被改变了。
 对象、数组都是引用数据类型。所有引用类型的默认值都是null。一个引用变量可以用来引用与任何与之兼容的类型。

 自动类型转换：
 低  ------------------------------------>  高
 byte,short,char—> int —> long—> float —> double

 强制类型转换：
 数据类型有高向低转换时，要强制转换

 java变量类型：
 成员变量
 局部变量
 类变量
 局部变量：
 局部变量声明在方法、构造方法或者语句块中；
 局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
 访问修饰符不能用于局部变量；
 局部变量只在声明它的方法、构造方法或者语句块中可见；
 局部变量是在栈上分配的。
 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
 成员变量：
 实例变量声明在一个类中，但在方法、构造方法和语句块之外；
 当一个对象被实例化之后，每个实例变量的值就跟着确定；
 实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
 实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
 实例变量可以声明在使用前或者使用后；
 访问修饰符可以修饰实例变量；
 实例变量对于类中的方法、构造方法或者语句块是可见的。一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
 实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；
 实例变量可以直接通过变量名访问。
 类变量：
 类变量也称为静态变量，在类中以static关键字声明，但必须在方法构造方法和语句块之外。
 无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
 静态变量除了被声明为常量外很少使用。常量是指声明为public/private，final和static类型的变量。常量初始化后不可改变。
 静态变量储存在静态存储区。经常被声明为常量，很少单独使用static声明变量。
 静态变量在程序开始时创建，在程序结束时销毁。
 与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为public类型。
 默认值和实例变量相似。数值型变量默认值是0，布尔型默认值是false，引用类型默认值是null。变量的值可以在声明的时候指定，也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。
 静态变量可以通过：ClassName.VariableName的方式访问。
 类变量被声明为public static final类型时，类变量名称必须使用大写字母。如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。

 运算符：
 前缀自增自减(++a,--a) 先进行自增，自减运算，再进行表达式运算
 后缀自增自减(a--,a++) 先进行表达式运算，再进行自增自减运算。
*/
public class Type {
    private String name; //成员变量
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void cry(){
         String age="17";//局部变量
        System.out.println(age);
    }
    public static void cry1(){
        String age="18";//局部变量
        System.out.println(age);
    }
    private static String name1;  //静态变量
    private static final String KAIFA="开发人员";

    public static void main(String args[]){
        Type type=new Type();
        type.setName("lisi");
        System.out.println(type.getName());
        type.cry();
        cry1();//静态方法
        name1="100";
        System.out.println(KAIFA+name1);
    }
}
