package com.neuedu.a;

public class Test8 {
    public static void main(String[] args) {
        //用 while 循环，计算 1~200 之间所有 3 的倍数之和。
        int a=1;
        int n=0;

        while (a<200){
            a++;
            if (a%3==0){
                n+=a;
            }
        }
        System.out.println(n);
    }
}
