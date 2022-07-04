package com.learnjava.sn;

/**
 * @Author bytedance
 * @Date 2022/3/1 10:42 AM
 */
public class JoinChar {
    public static void main(String[] args) {
        // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        int a = 72;  //十进制72 的Unicode
        int b = 105;  //.....
        int c = 65281;
        char e =(char)a;
        char f =(char)b;
        char g =(char)c;
        String s ="\u0048\u0069\uff01";
        String n =""+(char)a+(char)b+(char)c;//加个""用来表示当前为字符串
        String m =""+e+f+g;
        System.out.println(s);
        System.out.println(n);
        System.out.println(m);

    }
}
