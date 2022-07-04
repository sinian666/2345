package com.learnjava.sn;

/**
 * @Author bytedance
 * @Date 2022/2/27 6:52 PM
 */
public class Floatcount {

    public static void main(String[] args) {
        // x*x + 3*x - 4 = 0
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        // 求平方根可用 Math.sqrt():
        // double x = Math.sqrt(2)); // ==> 1.414
        // TODO:
        double e=0-b;
        double r1 = (Math.sqrt(b*b-4.0*a*c)-b)/2*a;
        double r2 = -(b+Math.sqrt(b*b-4.0*a*c))/2*a;
        System.out.println(r1 + ", " + r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
        System.out.println(b*b-4.0*a*b);
    }
}
