package com.neuedu.a;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //一个5位数，判断它是不是回文数。即12321是回文数，
        // 个位与万位相同，十位与千位相同。
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b=a%10;
        int c=a/10%10;
        int d=a/100%10;
        int e=a/1000%10;
        int f=a/10000%10;
        if (b==f&&c==e){
            System.out.println(a+"是回文数");
        }else{
            System.out.println(a+"不是回文数");
        }
    }
}
