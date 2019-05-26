package com.neuedu.a;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //判断一个年份是平年还是闰年
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a%4==0&&a%100!=0){
            System.out.println(a+"是闰年");
        }else if (a%400==0){
            System.out.println(a+"是世纪闰年");
        }else {
            System.out.println(a+"是平年");
        }
    }
}
