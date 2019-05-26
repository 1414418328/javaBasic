package com.neuedu.a;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //利用条件运算符的嵌套来完成此题：学习成绩>=90分的
        // 同学用A表示，60-89分之间的用B表示，60分以下 的用C表示
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a>=90&&a<=100){
            System.out.println("A");
        }else if(a>=60&&a<=89){
            System.out.println("B");
        }else if(a<60){
            System.out.println("C");
        }
    }

}
