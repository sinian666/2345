package com.learnjava.sn;

/**
 * @Author bytedance
 * @Date 2022/2/27 6:56 PM
 */


//短路运算
//        布尔运算的一个重要特点是短路运算。如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果。
//
//        因为false && x的结果总是false，无论x是true还是false，因此，与运算在确定第一个值为false后，不再继续计算，而是直接返回false。
//
//        我们考察以下代码：
//public class com.learnjava.sn.Booleancount {
//    public static void main(String[] args) {
//        boolean b = 5 < 3;
//        boolean result = b && (5 / 0 > 0);
//        System.out.println(result);
//    }
//}
//false && a 结果永远是FALSE
//true || a  的结果永远是true

//三元运算符
//        Java还提供一个三元运算符b ? x : y，它根据第一个布尔表达式的结果，分别返回后续两个表达式之一的计算结果。示例：
//public class com.learnjava.sn.Booleancount {
//    public static void main(String[] args) {
//        int n = -100;
//        int x = n >= 0 ? n : -n;
//        System.out.println(x);
//    }
//}
//上述语句的意思是，判断n >= 0是否成立，如果为true，则返回n，否则返回-n。这实际上是一个求绝对值的表达式。
//        注意到三元运算b ? x : y会首先计算b，如果b为true，则只计算x，否则，只计算y。此外，x和y的类型必须相同，因为返回值不是boolean，而是x和y之一。

//判断指定年龄是否是小学生（6～12岁）：
public class Booleancount {
    public static void main(String[] args) {
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent =age>=6&&age<=12;
        System.out.println(isPrimaryStudent ? "Yes" : "No");

    }
}
