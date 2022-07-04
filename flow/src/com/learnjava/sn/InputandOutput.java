package com.learnjava.sn;//流程控制语句中的 输入与输出

//帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
import java.util.Scanner;
/**
 * @Author bytedance
 * @Date 2022/3/1 3:48 PM
 */
public class InputandOutput {
    public static void main(String[] args) {
//		int prev = 80;
//		int score = 90;
//		double percent = 0.1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input prey: ");
        int prey = scanner.nextInt();
        System.out.print("Input score: ");
        int score = scanner.nextInt();
        double percent =((score-prey)*100)/prey;
        System.out.printf("成绩提高了 %.2f%%",percent);
    }
}
/*
使用System.out.println()来向屏幕输出一些内容。

println是print line的缩写，表示输出并换行。因此，如果输出后不想换行，可以用print()：
//
public class Main {
    public static void main(String[] args) {
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
    }
}
//如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能。格式化输出使用System.out.printf()，通过使用占位符%?，printf()可以把后面的参数格式化成指定格式：
public class Main {
    public static void main(String[] args) {
        double d = 3.1415926;
        System.out.printf("%.2f\n", d); // 显示两位小数3.14
        System.out.printf("%.4f\n", d); // 显示4位小数3.1416
    }
}
Java的格式化功能提供了多种占位符，可以把各种数据类型“格式化”成指定的字符串：
占位符	说明
%d	格式化输出整数
%x	格式化输出十六进制整数
%f	格式化输出浮点数
%e	格式化输出科学计数法表示的浮点数
%s	格式化字符串

注意，由于%表示占位符，因此，连续两个%%表示一个%字符本身。

占位符本身还可以有更详细的格式化参数。下面的例子把一个整数格式化成十六进制，并用0补足8位：


输入
和输出相比，Java的输入就要复杂得多。
我们先看一个从控制台读取一个字符串和一个整数的例子：
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}
首先，我们通过import语句导入java.util.Scanner，import是导入某个类的语句，必须放到Java源代码的开头，后面我们在Java的package中会详细讲解如何使用import。

然后，创建Scanner对象并传入System.in。System.out代表标准输出流，而System.in代表标准输入流。直接使用System.in读取用户输入虽然是可以的，但需要更复杂的代码，而通过Scanner就可以简化后续的代码。

有了Scanner对象后，要读取用户输入的字符串，使用scanner.nextLine()，要读取用户输入的整数，使用scanner.nextInt()。Scanner会自动转换数据类型，因此不必手动转换。

要测试输入，我们不能在线运行它，因为输入必须从命令行读取，因此，需要走编译、执行的流程：

$ javac Main.java
这个程序编译时如果有警告，可以暂时忽略它，在后面学习IO的时候再详细解释。编译成功后，执行：

$ java Main
Input your name: Bob
Input your age: 12
Hi, Bob, you are 12

 */
