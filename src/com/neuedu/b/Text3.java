package com.neuedu.b;

 class Calculator {
    private int iFirstNum;
    private int iSecondNum;

    public Calculator(int iFirst, int iSecond){
        this.iFirstNum = iFirst;
        this.iSecondNum = iSecond;
    }

    public int getAdd(){
        return this.iFirstNum + this.iSecondNum;
    }

    public int getSub(){
        return this.iFirstNum - this.iSecondNum;
    }

    public int getMul(){
        return this.iFirstNum * this.iSecondNum;
    }

    public void getDev(){
        if(this.iSecondNum ==0){
            System.out.print("分子不能为零！");
        }
        else
        {
            System.out.print(this.iFirstNum/this.iSecondNum);
        }
    }

}

//测试类
class Test3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculator oCal = new Calculator(4,2);
        System.out.println("两数之和为 ："+oCal.getAdd());
        System.out.println("两数之差为："+oCal.getSub());
        System.out.println("两数之积为："+oCal.getMul());
        System.out.print("两数之商为：");
        oCal.getDev();
    }

}