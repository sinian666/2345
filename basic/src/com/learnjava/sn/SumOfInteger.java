package com.learnjava.sn; /**
 * @Author bytedance
 * @Date 2022/2/27 5:53 PM
 */
//计算前N个数之和
/**
 * Sum of integers.
 */
public class SumOfInteger {
    public static void main(String[] args) {
        int n = 100;
        // TODO: sum = 1 + 2 + ... + n
        int sum = ((1+n)*n)/2;
        System.out.println(sum);
        System.out.println(sum == 5050 ? "测试通过" : "测试失败");
    }
}
