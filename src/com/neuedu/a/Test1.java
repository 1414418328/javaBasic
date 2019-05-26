package com.neuedu.a;

public class Test1 {
    //分别计算1-100之间的奇数和 和偶数和
    public static void main(String[] args) {

        int sum1=0;
        int sum2=0;
        for(int a=1;a<=100;a++){
            if (a%2==1){
                sum1 +=a;
            }else {
                sum2 +=a;
            }

        }
        System.out.println("奇数和："+sum1);
        System.out.println("偶数和："+sum2);
    }

}
