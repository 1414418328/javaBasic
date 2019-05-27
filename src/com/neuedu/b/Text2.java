package com.neuedu.b;
import java.util.Scanner;

//圆的类
class Circle {
    private double radius;

    public Circle(double dRadius){
        this.radius = dRadius;
    }

    public double getLength(){
        return 2*Math.PI*this.radius;
    }

    public double getArea()
    {
        return Math.PI*this.radius*this.radius;
    }

}


//测试类：

class Test2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double iRadius;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        iRadius = sc.nextDouble();
        if(iRadius < 0){
            System.out.println("你输入的半径有误!");
        }
        else{
            Circle oCir = new Circle(iRadius);
            System.out.println("圆的周长为："+oCir.getLength());
            System.out.println("圆的面积为："+oCir.getArea());
        }


    }

}