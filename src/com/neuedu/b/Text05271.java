package com.neuedu.b;
//长方形的类
class Rectangle{
    //定义长宽属性
    private int iWidth;
    private int iHeight;
    //构造器1
    public Rectangle(){
        this.iHeight = 1;
        this.iWidth = 1;
    }
    //构造器2
    public Rectangle(int iIndex){
        this.iWidth = iIndex;
        this.iHeight = iIndex;
    }
    //构造器3
    public Rectangle(int iWidth, int iHeight){
        this.iHeight = iHeight;
        this.iWidth = iWidth;
    }
    //求周长
    public int getLength(){
        return 2*(this.iHeight+this.iWidth);
    }
    //求面积
    public int getSquare(){
        return this.iHeight*this.iWidth;
    }

}

//测试类：
class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rectangle oRec1 = new Rectangle();
        System.out.println("默认长方形的周长为："+oRec1.getLength());
        System.out.println("默认长方形的面积为："+oRec1.getSquare());

        Rectangle oRec2 = new Rectangle(2);
        System.out.println("一个参数长方形的周长为："+oRec2.getLength());
        System.out.println("一个参数长方形的面积为："+oRec2.getSquare());

        Rectangle oRec3 = new Rectangle(2,3);
        System.out.println("两个参数长方形的周长为："+oRec3.getLength());
        System.out.println("两个参数长方形的面积为："+oRec3.getSquare());

    }

}