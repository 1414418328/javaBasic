package com.neuedu.a;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //编写程序，输入一个字符，判断它是否为小写字母，
        // 如果是，将它转换成大写字母，否则，不转换。
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char w = s.charAt(0);
        if (w>='a'&&w<='z'){
            w -= 32;
            System.out.println(w);
        }else if (w>='A'&&w<='Z'){
            System.out.println(w);

        }

    }
}
