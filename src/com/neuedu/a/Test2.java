package com.neuedu.a;

public class Test2 {
    //打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
    // 其各位数字立方和等于该数本身。例如：
    // 153是一个"水仙花数"，因为153=1的三次
    //方＋5的三次方＋3的三次方。
    public static void main(String[] args) {

        for (int a=100;a<=999;a++){
            int b=a%10;//个位
            int c=a/10%10;//十位
            int d=a/100%10;//百位
            if (a==d*d*d+c*c*c+b*b*b){
                System.out.println(a);
            }
        }

    }
}
