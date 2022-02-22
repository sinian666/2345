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
//float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
//double d = 1.79e308;
//double d2 = -1.79e308;
//double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
