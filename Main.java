//第一次创建Java文件，命名不正确，又不想修改下面的内容，这里更名一下：variable_date_type
//public class Main {
//    public static void main ( String[] args) {
//        System.out.println("hello,world!");
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int n = 100; // 定义变量n，同时赋值为100
//        System.out.println("n = " + n); // 打印n的值
//
//        n = 200; // 变量n赋值为200
//        System.out.println("n = " + n); // 打印n的值
//
//        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
//        System.out.println("x = " + x); // 打印x的值
//
//        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
//        System.out.println("x = " + x); // 打印x的值
//        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？
//    }
//}

//基本的数据类型
/*整数类型：byte，short，int，long
浮点数类型：float，double
字符类型：char
布尔类型：boolean

计算机内存的最小存储单元是字节（byte），一个字节就是一个8位二进制数，即8个bit
一个字节是1byte，1024字节是1K，1024K是1M，1024M是1G，1024G是1T

4T = 4 x 1024G
   = 4 x 1024 x 1024M
   = 4 x 1024 x 1024 x 1024K
   = 4 x 1024 x 1024 x 1024 x 1024
   = 4398046511104

byte是一个字节
short是两个字节
int是四个字节
long是8个字节
float是4个字节
double是8个字节
char是2个字节

 */
//定义整形；
//public class Main {
//    public static void main(String[] args) {
//        int i = 2147483647;
//        int i2 = -2147483648;
//        int i3 = 2_000_000_000; // 加下划线更容易识别
//        int i4 = 0xff0000; // 十六进制表示的16711680
//        int i5 = 0b1000000000; // 二进制表示的512
//        long l = 9000000000000000000L; // long型的结尾需要加L
//        System.out.println(i);
//        System.out.println(i2);
//        System.out.println(i3);
//        System.out.println(i4);
//        System.out.println(i5);
//        System.out.println(l);
//    }
//}
//浮点型
//浮点型数据需要在数据末尾加上"f",而double型则不需要
//float f1 = 3.14f;
//float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38  可以用来表示最大的数据
//double d = 1.79e308;
//double d2 = -1.79e308;
//double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324   double型可以表示的最大数据

//布尔类型
//boolean 类型的值只有两个true与false两个值
//boolean b1 = true;
//boolean b2 = false;
//boolean isGreater = 5 > 3; // 计算结果为true
//int age = 12;
//boolean isAdult = age >= 18; // 计算结果为false

import javax.swing.*;

//字符类型
//char
//Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符
//public class Main {
//    public static void main (String[] args){
//        char a ='A';
//        char zh = '中';
//        System.out.println(a);
//        System.out.println(zh);
//    }
//}
//注意 char 类型使用的是单引号''，string 字符串类型使用的是双引号""，两者要区分开


//引用类型：
//引用类型最多使用的是string 类型，即字符串。
//String s = "hello";


//常量
//在定义变量的时候如果加上  final 这个修饰符，则该变量就成了常量
//final double PI = 3.14;
//double r=5.0;
//double area =PI * r * r;
//PI = 300 //在上面已经定义PI是常量的情况下，这种赋值是完全错误的

//关键字：var
//有些时候，某些类的名字实在太长了，不想写，但又要新建一个名字
//
//StringBuilder sb = new StringBuild();
//这时候可以用var来表示
//var sb = new StringBuilder();
//实际上，在编译的过程中会自动变成
//StringBuilder sb = new StringBuild();

//变量的作用范围
//在Java中，多行语句用{ }括起来。很多控制语句，例如条件判断和循环，都以{ }作为它们自身的范围，例如：
//if (...) { // if开始
//    ...
//    while (...) { // while 开始
//        ...
//        if (...) { // if开始
//            ...
//        } // if结束
//        ...
//    } // while结束
//    ...
//} // if结束
//只要正确地嵌套这些{ }，编译器就能识别出语句块的开始和结束。而在语句块中定义的变量，它有一个作用域，就是从定义处开始，到语句块结束。超出了作用域引用这些变量，编译器会报错。举个例子：
//{
//    ...
//    int i = 0; // 变量i从这里开始定义
//    ...
//    {
//        ...
//        int x = 1; // 变量x从这里开始定义
//        ...
//        {
//            ...
//            String s = "hello"; // 变量s从这里开始定义
//            ...
//        } // 变量s作用域到此结束
//        ...
//        // 注意，这是一个新的变量s，它和上面的变量同名，
//        // 但是因为作用域不同，它们是两个不同的变量:
//        String s = "hi";
//        ...
//    } // 变量x和s作用域到此结束
//    ...
//} // 变量i作用域到此结束









